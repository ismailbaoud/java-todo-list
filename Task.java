package com.example.java.todolist;

public class Task {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String title , String description) {
        this.id = ++idCounter;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description ) {
        this.description = description;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString(){
        return "[ID: " + id + "]" + title + " - " + description + (completed? " [✔ Completed]" : " [ ]");
    }


}
