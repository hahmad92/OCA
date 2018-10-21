package oca.chapter6;

class NoMoreCarrotsException extends Exception {
}

public class Bunny {
	public static void main(String[] args) throws NoMoreCarrotsException {
		eatCarrot();// DOES NOT COMPILE
	}

	private static void eatCarrot() throws NoMoreCarrotsException {
	}
}