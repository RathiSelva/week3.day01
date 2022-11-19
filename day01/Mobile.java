package week3.day01;

public class Mobile {

	public void sendMsg() {
		System.out.println("Send the Message");
	}

	public void makeCall() {
		System.out.println("Make the Call");
	}

	public void saveContact() {
		System.out.println("Save all contact properly");
	}

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.sendMsg();
		mobile.makeCall();
		mobile.saveContact();

	}
}
