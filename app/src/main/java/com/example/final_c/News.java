package com.example.final_c;

public class News {
    private String title;
    private String description;
    private String date;
    private int imageResource;

    public News(String title, String description, int imageResource) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getImageResource() {
        return imageResource;
    }

}
