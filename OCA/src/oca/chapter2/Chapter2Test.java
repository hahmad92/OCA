package oca.chapter2;

public class Chapter2Test {

	public static int hourOfDay = 10;
	public static void main(String[] args) {
		
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}
	}

}
