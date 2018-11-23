package oca.chapter2;

public class DoWhileStatement {

	public static void main(String[] args) {

	}

	public static void constentVariableInLoop() {
		System.out.println("Start of method : constentVariableInLoop");
		final int i = 0;
		do {
			System.out.println(i);
		} while (i < 10);
		System.out.println("End of method : constentVariableInLoop");
	}

	public static void constentVariableInLoop1() {
		System.out.println("Start of method : constentVariableInLoop1");
		final int i = 0;
		while (i < 10) {
			if (2 == 3)
				return;
			System.out.println(i);
		}
		System.out.println("End of method : constentVariableInLoop1");
	}

	public static void constentVariableInLoop2() {
		System.out.println("Start of method : constentVariableInLoop2");
		final int i = 0;
		while (i < 10) {
			if (2 == 3) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("End of method : constentVariableInLoop2");
	}

	public static void falseInWHile() {
		System.out.println("Start of method : falseInWHile");
		while (false) {
			System.out.println("1");
		}
		System.out.println("End of method : falseInWHile");
	}

	public static void trueInWhileWithoutBreak() {
		System.out.println("Start of method : trueInWhile");
		while (true) {
			System.out.println("1");
		}
		System.out.println("End of method : trueInWhile");
	}

	public static void trueInWhileWitBreak() {
		System.out.println("Start of method : trueInWhile");
		while (true) {
			System.out.println("1");
			break;
		}
		System.out.println("End of method : trueInWhile");
	}

}
