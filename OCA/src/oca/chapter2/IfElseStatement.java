package oca.chapter2;

public class IfElseStatement {

	public static void main(String[] args) {
		int hourOfDay = 10;
		if (hourOfDay < 11.0)
			System.out.println("Good Morning");
		else {
			System.out.println("Good Afternoon");
		}

		char c = 'a';
		byte b = 10;
		short s = 11;
		int i = 9;
		long l = 9;
		double d = 10.1;
		float f = 9.9f;
		
		if (hourOfDay < c) {
			System.out.println("Good Morning");
		} else if (hourOfDay < f) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		
		Integer it1 = 10;
		Integer it2 = 9;
		if (it1 < it2) {
			System.out.println("Good Morning");
		} 
		
		if(l > b) {
			System.out.println("l > b");
		}else if(b > l) {
			System.out.println("b > l");
		}
	}

}
