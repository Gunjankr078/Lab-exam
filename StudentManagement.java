package practice1;

import java.util.HashMap;

public class StudentManagement {
    private HashMap<Integer, Students> studentMap = new HashMap<>();

    // Add a new student
    public void addStudent(Students student) {
        studentMap.put(student.getId(), student);
        System.out.println("Student added successfully.");
    }

    // Update student details
    public void updateStudent(Integer id, String name, String course, Double marks) {
        Students student = studentMap.get(id);
        if (student != null) {
            student.setName(name);
            student.setCourse(course);
            student.setMarks(marks);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete a student
    public void deleteStudent(Integer id) {
        if (studentMap.remove(id) != null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Search for a student
    public void searchStudent(Integer id) {
        Students student = studentMap.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Students student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }

    // Business Logic: Get students eligible for scholarship
    public void getScholarshipEligibleStudents() {
        boolean found = false;
        for (Students student : studentMap.values()) {
            if (student.getMarks() >= 85) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students are eligible for the scholarship.");
        }
    }

    public static void main(String[] args) {
        StudentManagement system = new StudentManagement();

        // Example usage
        system.addStudent(new Students(1, "Alice", "Computer Science", 90.0));
        system.addStudent(new Students(2, "Bob", "Mathematics", 75.0));
        system.displayAllStudents();
        system.getScholarshipEligibleStudents();
        system.updateStudent(2, "Bob", "Physics", 88.0);
        system.searchStudent(2);
        system.deleteStudent(1);
        system.displayAllStudents();
    }
}