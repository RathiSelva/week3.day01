package week3.day01;

public class Students {

	public void getStudentInfo(int Idnumber) {
		System.out.println("ID number of the student is " + Idnumber);
	}

	public void getStudentInfo(int Idnumber, String Name) {
		System.out.println("ID number and Name of the student is " + Idnumber + Name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email address and phonenumber of Student is " + email + phoneNumber);
	}

	public static void main(String[] args) {
		Students ss = new Students();
		ss.getStudentInfo(253545);
		ss.getStudentInfo(253545, " and XRYR");
		ss.getStudentInfo("xryr01@gmail.com and ", 9101010101L);}

	}


