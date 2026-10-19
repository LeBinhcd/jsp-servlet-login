# JSP Servlet Login

Ứng dụng đăng nhập Java JSP/Servlet tương thích Tomcat 10.1+.

## Thông tin đăng nhập

- Username: `admin`
- Password: `admin`

Đăng nhập đúng hiển thị `Welcome admin to website`. Thông tin sai hiển thị `Login Error`.

## Yêu cầu môi trường

- JDK 17 hoặc mới hơn
- Apache Maven 3.9+
- Apache Tomcat 10.1+

Kiểm tra cài đặt:

```powershell
java -version
mvn -version
```

## Cấu trúc dự án

```text
jsp-servlet-login/
├── pom.xml
├── src/main/java/com/codegym/LoginServlet.java
└── src/main/webapp/
    ├── index.jsp
    └── WEB-INF/web.xml
```

## Build WAR

Mở terminal tại thư mục gốc dự án:

```powershell
mvn clean package
```

Khi thấy `BUILD SUCCESS`, file deploy được tạo tại:

```text
target/jsp-servlet-login.war
```

## Deploy lên Tomcat

1. Copy `target/jsp-servlet-login.war` vào thư mục `webapps` của Tomcat.
2. Khởi động Tomcat bằng `bin/startup.bat` trên Windows hoặc `bin/startup.sh` trên macOS/Linux.
3. Truy cập:

```text
http://localhost:8080/jsp-servlet-login/
```

Tomcat sẽ tự giải nén WAR thành thư mục ứng dụng.

## Kiểm thử

### Thành công

Nhập `admin` / `admin` để nhận `Welcome admin to website`.

### Thất bại

Nhập bất kỳ thông tin khác, ví dụ `user` / `123`, để nhận `Login Error`.

## Ghi chú kỹ thuật

- Form dùng `method="POST"` và gửi tới endpoint `/login`.
- Servlet dùng `jakarta.servlet.*`, phù hợp Tomcat 10+.
- Annotation `@WebServlet` ánh xạ `/login`.
- `web.xml` dùng Servlet specification 6.0.
- Servlet có `doGet()` redirect về trang đăng nhập.
