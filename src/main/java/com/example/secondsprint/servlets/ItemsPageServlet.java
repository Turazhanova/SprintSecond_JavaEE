package com.example.secondsprint.servlets;

import com.example.secondsprint.db.DBConnection;
import com.example.secondsprint.model.Item;
import com.example.secondsprint.service.ItemService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/home.html"})
public class ItemsPageServlet extends HttpServlet {
    ItemService itemService = new ItemService(DBConnection.getConnection());

    public ItemsPageServlet() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = this.itemService.getAllItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/items.jsp").forward(request, response);
    }
}
