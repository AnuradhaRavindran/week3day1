package week3.day1;

public class Student {
	public void studentName() {
		System.out.println("This is student name method");
	}
	public void studentDept() {
		System.out.println(" This is  studentdept method");

	}
	public void studentId() {
		System.out.println("This is studentid method");
	}
	public static void main(String[] args) {
		College obj = new College();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		obj.departmentName();
		
	}

}

