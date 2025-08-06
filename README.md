# 📝 Java To-Do List Application

This is a simple **console-based To-Do List app** built using **pure Java**. It allows users to add, view, and manage tasks through the command line.

---

## ✅ Requirements

Before running the project, make sure the following tools are installed on your machine:

- ✅ **Java JDK 8 or later**  
  [Download Java here](https://www.oracle.com/java/technologies/javase-downloads.html)

- ✅ **Terminal / Command Line Access**  
  (Command Prompt, PowerShell, Terminal, etc.)

- ✅ **Optional: A Java IDE or Text Editor**  
  (e.g., IntelliJ IDEA, VS Code, Eclipse — only if you prefer GUI development)

---

## 📁 Folder Setup Instructions

In order for the Java package structure to work correctly, you **must place the cloned project folder** in a specific path before compiling.

### 🔧 Step-by-step setup:

1. Clone or download this project.

2. Rename the folder (if needed) to: `todolist`

3. Move this folder into the following path structure:

```
packages/
└── com/
    └── example/
        └── java/
            └── todolist/
                ├── Main.java
                ├── Task.java
                ├── TaskManager.java
                └── (any other .java files)
```

> This matches the declared Java package: `package com.example.java.todolist;`

---

## 🚀 How to Compile and Run

Follow these steps in your terminal:

### 1. Navigate to the `packages` directory:

```bash
cd path/to/packages
```

Example:

```bash
cd C:/Users/YourName/Desktop/packages
```

### 2. Compile the project:

```bash
javac com/example/java/todolist/*.java
```

This will compile all Java files and generate `.class` files in the same directory.

### 3. Run the application:

```bash
java com.example.java.todolist.Main
```

---

## 🧠 How It Works

- `Main.java`: Entry point with the `main()` method.
- `Task.java`: Represents a single to-do task.
- `TaskManager.java`: Handles task storage, adding, removing, and displaying.

---

## 🛠 Troubleshooting

- ❗ **Error: "package com.example.java.todolist does not exist"**  
  → Make sure your folder structure matches the package name exactly.

- ❗ **Error: "Could not find or load main class"**  
  → Double-check that you're running from the `packages/` folder and using the correct class name.

- ❗ **Can't compile?**  
  → Ensure Java is correctly installed and added to your system's `PATH`.

---

## 📄 License

This project is open-source and free to use for learning or modification.

---

## 🙋‍♂️ Questions or Help?

If you run into issues or need help, feel free to open an issue or contact the maintainer.

Enjoy coding! 🚀