package Homework;

public class Calculator {
	private int num1;
	private int num2;
	
	Calculator(int num1, int num2){
		this.setNum1(num1);
		this.setNum2(num2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1- num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int square(int num1) {
		return num1*num1;
	}
	
	public static void main(String[] args) {
		Calculator myNum = new Calculator(18,9);
		int num1 = myNum.getNum1();
		int num2 = myNum.getNum2();
		
		System.out.println("add " + myNum.add(num1, num2));
		System.out.println("subtract " + myNum.subtract(num1, num2));
		System.out.println("multiply " +myNum.multiply(num1, num2));
		System.out.println("divide" + myNum.divide(num1, num2));
		System.out.println("square"  + myNum.square(num1));
				
	}
	
}
