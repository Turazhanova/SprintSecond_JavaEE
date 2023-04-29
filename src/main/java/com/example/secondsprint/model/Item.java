package com.example.secondsprint.model;

import java.io.Serializable;

public class Item implements Serializable {
    private Long id;
    private String name;
    private String description;
    private double price;

    public Item() {
    }

    public Item(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Items [id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", price=" + this.price + "]";
    }
}
