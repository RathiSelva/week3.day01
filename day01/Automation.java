package week3.day01;

public class Automation extends MultipleLanguage {
	@Override
	public void ruby() {
		System.out.println("Ruby");

	}

	public static void main(String[] args) {
		Automation se = new Automation();
		se.java();
		se.selenium();
		se.python();
		se.ruby();
	}

}
