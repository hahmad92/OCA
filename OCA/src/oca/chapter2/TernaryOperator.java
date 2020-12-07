package oca.chapter2;

public class TernaryOperator {

	public static void main(String[] args) {

		int y = 4;
		final int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		System.out.println(x);
		int x1 = (y > 5) ? (2 * y) : 3 * y;
		System.out.println(x1);
		
		long y2 = 9;
		
		System.out.println((y2 > 5) ? (2 * y2) : 3 * y2);
		
		//This will cause an error because of type mismatch
		//int x2 = (y > 5) ? (2 * y2) : 3 * y2;
		
		System.out.println((y > 5) ? 21 : "Zebra");
		//int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

	}

}
