package com.example.secondsprint.servlets;

import com.example.secondsprint.db.DBConnection;
import com.example.secondsprint.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/login"})
public class LoginPageServlet extends HttpServlet {
    UserService userService = new UserService(DBConnection.getConnection());

    public LoginPageServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String user_full_name = this.userService.getUser(username, password);
        if (user_full_name != null) {
            request.setAttribute("user", user_full_name);
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        } else {
            request.setAttribute("text", "Incorrect login or password!");
            request.getRequestDispatcher("/signup.jsp").forward(request, response);
        }

    }
}
