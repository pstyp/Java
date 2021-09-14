package com.qa.qacommunity;

public class Conditionals {
	public static void main(String[] args) {
		
		switchCase();
	}
	

	public static void canPawelJava() {

		boolean canPawelJava = false;
		if (canPawelJava) {
			System.out.println("Pawel can Java");
		} else {
			System.out.println("Pawel can't Java");
		}
	}
	
	
	

	
	
	public static void numbersJava() {
		int number = 19;

		if (number <= 20) {
			System.out.println("Number is less than or equal to 20");
		} else if (number < 40) {
			System.out.println("Number is between 20 and 40");
		} else {
			System.out.println("Number is greater than or equal 40");
		}

	}
	
	

	
	

	public static void switchCase() {
		int num = 2;

		switch (num) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		case 5:
			System.out.println("Case 5");
			break;
		default:
			System.out.println("This is the default option");
			break;

		}

	}
}