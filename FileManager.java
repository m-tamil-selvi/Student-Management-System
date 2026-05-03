import java.io.*;
import java.util.*;

//FileManager class handles saving and loading students from a file
public class FileManager {
    static String FILE_NAME = "students.txt"; // File name

    // Save one student to the file
    static void saveStudent(Student student) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true); // true = append mode
            fw.write(student.toFileString() + "\n");  // Write student data
            fw.close();  // Close file
        }
        catch (IOException e) {
            System.out.println("Error saving student.");
        }

    }

    // Load all students from the file
    static ArrayList<Student > loadStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = br.readLine()) != null) {
                students.add(Student.fromFileString(line)); // Convert line to Student
            }
            br.close();
        } catch (FileNotFoundException e) {
            // File not found to happens first time, safe to ignore
        } catch (IOException e) {
            System.out.println("Error reading student file.");
        }
        return students;
    }


}
