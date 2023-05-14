package com.example.foodi;

import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


public class Product {

    @PrimaryKey
    @SerializedName("id")
    private int id;
    @SerializedName("image")
    private String image;
    @SerializedName("price")
    private String price;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("category")
    private String category;
    @SerializedName("rating")
    private Rating rating;

    public Product(int id, String image, String price, String title, String description, String category, Rating rating) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.category = category;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
