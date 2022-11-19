package week3.day01;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void add(int a, int b,int c) {
		System.out.println(a + b);}
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public void sub(double a, double b) {
		System.out.println(a - b);
	}
	public void mul(int a, double b) {
		System.out.println(a * b);
	}

	public void mul(double a, double b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cc = new Calculator();
		cc.add(20, 30);
		cc.add(20, 30,40);
		cc.sub(30, 20);
		cc.sub(30.505, 20.404);
		cc.mul(10,40.303);
		cc.mul(10.555,40.303);
		

	}

}
