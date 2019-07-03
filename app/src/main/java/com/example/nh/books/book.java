package com.example.nh.books;

public class book {

    private int img;
    private float rate;
    private String name;
    private String author;

    public book(int img, float rate, String name, String author) {
        this.img = img;
        this.rate = rate;
        this.name = name;
        this.author = author;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}