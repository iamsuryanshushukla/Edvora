package com.example.edvora;

public class EdvoraModekl {
    private String product_name;
    private String brand_name;
    private String  price;
    private String discription;
    private String date;
    private String time;
    private String image;

    // Getter Methods

    public String getProduct_name() {
        return product_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscription() {
        return discription;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getImage() {
        return image;
    }

    // Setter Methods

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setImage(String image) {
        this.image = image;
    }
}