# MoviesApp_doan
			Hướng dẫn down source code
	Sau khi download code từ file Zip hoặc file Rar và giải nén hoặc link git ta chú ý một số điều sau để sử dụng được mọi chức năng của ứng dụng:
-	Sử dụng chức năng login cần phải build app phiên bản release và cần 1 số cấu hình nhỏ 
Bước 1: Chọn build variants 
Bước 2: Nhấn vào ô bên dưới Active build variant thay đổi debug thành release
Bước 3: Chọn build trên thanh công cụ và chọn clean project 
Bước 4: Chọn Build trên thanh công cụ và chọn Build Bundle/APK và chọn build APK 
Bước 5: Vào build gradle(Module app) thay đổi đường dẫn của storeFile file bằng cách vào thư mục lưu file project vào thư mục keystore và lấy đường dẫn đến tệp key.jks xong thay đổi đường dẫn như hình dưới 
Bước 6: Sync Now project, run app và có thể đăng nhập
Như vậy chúng ta đã sử dụng được chức năng đăng nhập của google ( lưu ý: để dùng đăng nhập google cần dùng thiệt bị điện thoại thật không phải máy ảo)
link git: https://github.com/tienvip122002/MoviesApp_doan.git
