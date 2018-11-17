package oca.chapter2;

public class NumericPromotion {

	public static void main(String[] args) {
		int x = 1;
		long y = 33;
		// int result = x * y; will not work
		long result1 = x * y;
		System.out.println(result1);

		double x1 = 39.21;
		float y1 = 2.1f;
		// float result2 = x1 + y1; // will not work
		double result3 = x1 + y1;
		System.out.println(result3);

		short x2 = 10;
		short y2 = 3;

		// short result4 = x2 + y2; // will not work
		int result5 = x2 + y2;
		System.out.println(result5);

		// What is the data type of x * y / z?
		short x3 = 14;
		float y3 = 13;
		double z3 = 30;

		// short result6 = x3 * y3 / z3;// will not work
		// float result7 = x3 * y3 / z3;// will not work
		double result8 = x3 * y3 / z3;
		System.out.println(result8);
	}

}
