package week3.day01;

public class BankInfo {
	public void saving() {
		System.out.println("Saving Schemes");
	}

	public void deposit() {
		System.out.println("Minimum Deposit Amount");
	}

	public void fixed() {
		System.out.println("Fixed deposit Requirements");

	}

	public static void main(String[] args) {

		BankInfo bi = new BankInfo();
		bi.saving();
		bi.deposit();
		bi.fixed();
	}

}
