package com.example.kfc01;

public class Product {
    private String name;
    private String description;
    private int imageResource;
    private String price;
    private String category;

    public Product(String name, String description, int imageResource, String price, String category) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getImageResource() { return imageResource; }
    public String getPrice() { return price; }
    public String getCategory() { return category; }
}
