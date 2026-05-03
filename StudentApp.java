import java.util.*;
import java.io.*;

// Main program with Menu
public class StudentApp {
    static ArrayList<Student> students; // List to store students

    public static void main(String[] args) {
        students = FileManager.loadStudents(); // Load students from file
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Show Menu
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                addStudent(sc);
            } else if (choice == 2) {
                viewStudents();
            } else if (choice == 3) {
                searchStudent(sc);
            } else if (choice == 4) {
                deleteStudent(sc);
            } else if (choice == 5) {
                break; // Exit loop
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

    }

    // Add a new student
    static void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);
        students.add(student); // Add to list
        FileManager.saveStudent(student); // Save to file
        System.out.println("Student saved!");
    }

    // Show all students
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Search student by ID
    static void searchStudent(Scanner sc) {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Students not found.");
    }

    // Delete student by ID
    static void deleteStudent(Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        // Find student in list
        Student toRemove = null;
        for (Student s : students) {
            if (s.id == id) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove); // Remove from list
            rewriteFile();             // Update file
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Helper method to rewrite file after deletion
    static void rewriteFile() {
        try {
            FileWriter fw = new FileWriter("students.txt"); // overwrite mode
            for (Student s : students) {
                fw.write(s.toFileString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error updating file.");
        }
    }

}


