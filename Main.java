package com.example.java.todolist;

import java.util.Scanner;

public class Main {

    public static void main  (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Todolist todolist = new Todolist();
        int choice;

                                            
        do {
            System.out.println("\nTodo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Mark Task Completed");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    todolist.addTask(title, description);
                    break;
                case 2:
                    todolist.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new task title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    todolist.updateTask(updateId, newTitle, newDescription);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    todolist.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = scanner.nextInt();
                    todolist.markTaskCompleted(completeId);
                    break;
                case 6:
                    System.out.println("Exiting the Todo List application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");  
                  
            }

        }while (choice != 6);
    }

}