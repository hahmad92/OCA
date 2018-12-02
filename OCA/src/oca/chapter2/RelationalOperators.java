package oca.chapter2;

public class RelationalOperators {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		System.out.println(x < y); // Outputs true
		System.out.println(x <= y); // Outputs true
		System.out.println(x >= z); // Outputs true
		System.out.println(x > z); // Outputs false

		// instanceof can only be applied to refrance types.
		// System.out.println( x instanceof y); //compile error
		String a = "hammad";
		System.out.println( a instanceof String);
		System.out.println( a instanceof Object);
	}

}
