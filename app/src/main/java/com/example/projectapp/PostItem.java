package com.example.projectapp;

public class PostItem {
    private String title;
    private String subHeading;
    private float rating;
    private int image;

    public PostItem(String title, String subHeading, float rating, int image) {
        this.title = title;
        this.subHeading = subHeading;
        this.rating = rating;
        this.image = image;
    }

    public PostItem (String title, int image) {
        this.title = title;
        this.image = image;
    }

    public PostItem(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubHeading() {
        return subHeading;
    }

    public void setSubHeading(String subHeading) {
        this.subHeading = subHeading;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }
}
