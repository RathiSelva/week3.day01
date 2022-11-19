package week3.day01;

public class AxisBank extends BankInfo {
	
public void deposit() {
	System.out.println("Minimum Deposit Amount is Rs.10000 in Axisbank");
}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
