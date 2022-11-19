package week3.day01;

public class AndroidPhone extends Mobile {
	public void takeVideo() {
		System.out.println("Take the call ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();

		Mobile mobile = new Mobile();
		mobile.sendMsg();
		mobile.makeCall();
		mobile.saveContact();
	}

}
