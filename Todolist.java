package com.example.java.todolist;

import java.util.ArrayList;
import java.util.List;

public class Todolist {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title,String description) {
        Task task = new Task(title, description);
        tasks.add(task);
        System.out.println("✅ Task added: " + task);
    }


    public void displayTasks() {
        if(tasks.isEmpty()) {
            System.out.println("📋 No tasks yet !.");
        }else{
            for(Task task :tasks) {
                System.out.println(task);
            }
        }
    }


    public void updateTask(int id , String newTitle, String newDescription) {
        
        for(Task task : tasks) {
            if(task.getId() == id) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                System.out.println("✅ Task updated: " + task);
                return;
            }
        }
    }

    public void deleteTask(int id) {
        for(Task task : tasks ) {
            if(task.getId() == id) {
                tasks.remove(task);
                System.out.println("🗑️ Task deleted: " + task);
                return;
            }
        }
    }


    public void markTaskCompleted(int id) {
        for (Task task : tasks) {
            if(task.getId() == id) {
                task.markCompleted();
                System.out.println("✅ Task marked as completed: " + task);
                return;
            }
        }
    }
}