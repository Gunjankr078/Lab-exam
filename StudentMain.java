package practice1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in); // Open scanner here, to be used in all methods
        StudentData s = new StudentData();
        ArrayList<Student> std = new ArrayList<>();
        // Add students and display the list
        std = s.addStudent();
        s.displayStd(std);
        
        // Save student list to file
        s.saveToFile(std);
        
        // Read student list from file
        s.readFromFile(std);
        
        // Find a student by ID
        s.findStudent(scn, std);
        
        // Remove a student by ID
        s.removeStudent(scn, std);
        
        // Display the updated student list
        System.out.println("Updated Student List:");
        s.displayStd(std);
        
        s.updateStudent(scn, std);
        s.displayStd(std);

        
        // Close the scanner after all operations
        scn.close();
    }
}
