package Basics;

public class Student extends person {

	private int grade;
	private String schoolName;
	public student(int age, String fullName, address a, int grade, String schoolName) {
		super(age, fullName, a);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	
	
	public String sayHello() {
		return "Hello from student";
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
}
