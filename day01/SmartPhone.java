package week3.day01;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsApp()

	{
		System.out.println("connect to WahtApp when get netwrok");
	}

	public void takeVideo()

	{
		System.out.println("connect to WahtApp and take video ");

	}

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.connectWhatsApp();
		// AndroidPhone ap = new AndroidPhone();
		sp.takeVideo();

		// Mobile mobile = new Mobile();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
	}

}
