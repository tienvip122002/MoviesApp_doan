package com.example.moviesapp.pay

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.example.moviesapp.screen.homeScreen.component.IconBackBlur

@Composable
fun PayScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)
        .padding(30.dp)) {
        IconBackBlur(
            icon = Icons.Default.ArrowBack,
            size = "small",
            onClick = {
                navController.popBackStack()
            }
        )
        Text(text = "Để thanh toán online bạn hãy chuyển khoản cho stk momo 0987458096 với nội dung tên phim: (tenphim_maphim)", color = Color.White)
        Text(text = "Chuyển đến momo ngay", color = Color.White)
        val context = LocalContext.current
        TextButton(onClick = {

            try {
                context.startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("https://momo.vn/redirect-cta?uc=superapp&to=https%3A%2F%2Fpage.momoapp.vn%2FbIG9Mz6NiZi&from=https%3A%2F%2Fmomo.vn%2Fsieu-ung-dung-momo\n" +

                        "Ví Điện Tử MoMo - Siêu Ứng Dụng Thanh Toán số 1 Việt Nam\n")))
            } catch (e: ActivityNotFoundException) {

            }
        }) {
            Text(text = "Chuyển Momo")
        }
        Text(text = "Sau khi chuyển tiền bạn hãy chụp hóa đơn và gửi qua mail sau:", color = Color.White)
        Text(text = "Chuyển đến momo ngay", color = Color.White)

        TextButton(onClick = {
            context.sendMail(to = "tienbanket@gmail.com", subject = "Hóa đơn!")
        }) {
            Text(text = "Chuyển Mail")
        }
    }
}
fun Context.sendMail(to: String, subject: String) {
    try {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "vnd.android.cursor.item/email" // or "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(to))
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        // TODO: Handle case where no email app is available
    } catch (t: Throwable) {
        // TODO: Handle potential other type of exceptions
    }
}