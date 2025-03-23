package practice1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {

    // Add students to the list
    public ArrayList<Student> addStudent() {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1001, "Gunjan", "PG-DAC", 80));
        st.add(new Student(1002, "Palash", "PG-DBDA", 69));
        st.add(new Student(1003, "Anshul", "PG-DBDA", 78));
        st.add(new Student(1004, "Vipul", "PG-DAC", 89));
        st.add(new Student(1005, "Shalu", "PG-DAC", 85));
        return st;
    }

    // Display student list
    public void displayStd(ArrayList<Student> std) {
        for (Student obj : std) {
            obj.displayStd();
        }
    }

	public void saveToFile(ArrayList<Student> std) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
		for (Student obj : std) {
			bw.write("Student's Id: "+obj.studentId +"\n");
			bw.write("Student's Name: "+obj.name +"\n");
			bw.write("Student's Course: "+obj.course +"\n");
			bw.write("Student's Score: "+obj.score +"\n");
			bw.write("---------*****---------" +"\n");
		}
		bw.close();
		System.out.println("File Saved:");
	}

	public void readFromFile(ArrayList<Student> std) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
	    String line;

	    while ((line = br.readLine()) != null) {
	        // You can process the 'line' if needed, e.g., populate student objects with file data
	        System.out.println(line);
	    }

	    br.close();
	    System.out.println("Finished reading from Student.txt");
	}

	public void findStudent(Scanner scn, ArrayList<Student> std) {
		// TODO Auto-generated method stub
		System.out.println("Enter Id to search Student");
		int id = scn.nextInt();
		for (Student obj : std) {
			if(obj.studentId == id) {
				System.out.println("Student Found");
				obj.displayStd();
			    return;
			}
		}
		System.out.println("Student Id "+id+" not Found");
	}

	public void removeStudent(Scanner scn, ArrayList<Student> std) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Id to remove Student");
		int id = scn.nextInt();
		
		std.removeIf(st -> st.studentId == id);
		saveToFile(std);
		System.out.println("File Updated");
	}

	public void updateStudent(Scanner scn, ArrayList<Student> std) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Id to update Student's marks");
		int id = scn.nextInt();
		System.out.println("Enter new marks");
		double marks = scn.nextInt();
		for (Student obj : std) {
			if(obj.studentId == id) {
				obj.score = marks;
				saveToFile(std);
				return;
			}
		}
	}

}
