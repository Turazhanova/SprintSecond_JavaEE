package com.example.secondsprint.service;

import com.example.secondsprint.model.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ItemService {
    Connection connection;

    public ItemService(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<Item> getAllItems() {
        ArrayList<Item> items = new ArrayList();

        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM items");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = resultSet.getDouble("price");
                items.add(new Item(id, name, description, price));
            }

            statement.close();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        return items;
    }
}
