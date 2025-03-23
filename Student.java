package practice1;

public class Student {

	int studentId;
	String name;
	String course;
	double score;
	
	public Student(int studentId, String name, String course, double score) {
//		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.score = score;
	}


	
	void displayStd() {
		System.out.println("Student's Id: "+studentId);
		System.out.println("Student's Name: "+name);
		System.out.println("Student's Course: "+course);
		System.out.println("Student's Score: "+score);
		System.out.println("---------*****---------");

	}
}
