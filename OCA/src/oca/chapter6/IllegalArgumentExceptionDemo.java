package oca.chapter6;

public class IllegalArgumentExceptionDemo {
	static int numberEggs;

	public static void main(String[] args) {
		setNumberEggs(-1);
	}

	public static void setNumberEggs(int numberEggs) {
		if (numberEggs < 0)
			throw new IllegalArgumentException("# eggs must not be negative");
		IllegalArgumentExceptionDemo.numberEggs = numberEggs;
	}
}
