<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>System Login</title>
    <style>
        body { font-family: Arial, sans-serif; display: flex; justify-content: center; margin-top: 100px; background: #f8fafc; }
        .login-container { width: min(360px, calc(100% - 32px)); padding: 30px; background: white; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,.1); text-align: center; }
        input { width: 90%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 4px; }
        button { width: 100%; padding: 10px 20px; color: white; background: #1b2a7a; border: 0; border-radius: 4px; cursor: pointer; }
    </style>
</head>
<body>
    <main class="login-container">
        <h1 style="color: #1b2a7a;">System Login</h1>
        <form action="login" method="POST">
            <label for="username">Username</label><br>
            <input id="username" type="text" name="username" placeholder="Enter username" required><br>
            <label for="password">Password</label><br>
            <input id="password" type="password" name="password" placeholder="Enter password" required><br>
            <button type="submit">Login</button>
        </form>
    </main>
</body>
</html>
