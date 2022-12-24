package com.example.sampletodosql.model;

public class Todo {
    private String id;
    private String title;
    private String description;
    private boolean is_completed;

    public Todo(String id, String title, String description, boolean is_completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.is_completed = is_completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }
}

