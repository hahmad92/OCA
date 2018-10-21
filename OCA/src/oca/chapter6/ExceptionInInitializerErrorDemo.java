package oca.chapter6;

public class ExceptionInInitializerErrorDemo {
	static {
		int[] countsOfMoose = new int[3];
		int num = countsOfMoose[-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
