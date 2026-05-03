public class Student {
    int id;
    String name;
    int age;

    // Constructor to create a new Student
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Convert student object into a line of text (CSV format)
    String toFileString() {
        return id + "," + name + "," + age;
    }

    // Convert a line of text back into a Student object
    static Student fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        return new Student(id, name, age);
    }

    //Print student details in a nice format
    public String toString() {
        return "ID: "  + id + ", Name: " + name + ", Age: " + age;
    }
}
