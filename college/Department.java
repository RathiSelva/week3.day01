package org.college;

public class Department extends College {
	public void departmentName() {
		System.out.println("CHEMISTRY");
	}

	public static void main(String[] args) {
		Department dd = new Department();
		
		dd.collegeName();
		dd.collegeCode();
		dd.collegeRank();
		dd.departmentName();

	}

}
