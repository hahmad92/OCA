package oca.chapter6;

public class CallingMethodsThatThrowExceptions {
	public void bad() {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {// DOES NOT COMPILE
			System.out.print("sad rabbit");
		}
	}

	public void good() throws NoMoreCarrotsException {
		eatCarrot();
	}

	private static void eatCarrot() {
	}
}
