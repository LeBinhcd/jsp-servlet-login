package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean valid = "admin".equals(username) && "admin".equals(password);
        String message = valid ? "Welcome admin to website" : "Login Error";
        String color = valid ? "green" : "red";

        try (PrintWriter out = response.getWriter()) {
            out.println("<!doctype html><html lang='en'><head><meta charset='UTF-8'><title>Login Result</title></head>");
            out.println("<body style='font-family:Arial,sans-serif;text-align:center;margin-top:100px'>");
            out.printf("<h1 style='color:%s'>%s</h1>%n", color, message);
            out.println("<p><a href='index.jsp'>Go back</a></p></body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
    }
}
