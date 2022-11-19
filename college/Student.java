package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("XXX");
	}

	public void studentDept() {
		System.out.println("AAA");
	}

	public void studentId() {
		System.out.println("CO22 1111");

	}

	public static void main(String[] args) {
		Student ss = new Student();
		ss.collegeName();
		ss.collegeCode();
		ss.collegeRank();
		ss.departmentName();

		ss.studentName();
		ss.studentDept();
		ss.studentId();
	}
}
