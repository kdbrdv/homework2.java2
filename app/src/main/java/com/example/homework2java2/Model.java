package com.example.homework2java2;

public class Model {
    private String title, description;
    private long date;
    private int id;


    public Model(String title, String description, int id, long date) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public long getDate() {
        return date;
    }
}
