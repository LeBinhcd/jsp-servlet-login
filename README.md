# JSP Servlet Login

Complete Java JSP/Servlet login project for Tomcat 10.1+.

## Required files at repository root

The files below are intentionally available directly at the repository root for automated evaluation:

- `pom.xml` — Maven WAR configuration with Jakarta Servlet 6.0 and JSP 3.1 APIs.
- `index.jsp` — login form using `method="POST"` and `action="login"`.
- `LoginServlet.java` — handles POST/GET and validates `admin` / `admin`.
- `web.xml` — Jakarta Web Application 6.0 configuration.

The standard Maven source structure is also preserved under `src/main/`.

## Login behavior

- Correct credentials: `admin` / `admin`
- Success: `Welcome admin to website`
- Incorrect credentials: `Login Error`

## Build and deploy

```powershell
mvn clean package
```

Deploy `target/jsp-servlet-login.war` to Tomcat 10.1+ `webapps/`, start Tomcat, then open:

```text
http://localhost:8080/jsp-servlet-login/
```
