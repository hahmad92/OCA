package oca.chapter2;

public class RelationalOperators {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		double a  = 10;
		System.out.println(x < y); // Outputs true
		System.out.println(x <= y); // Outputs true
		System.out.println(x >= z); // Outputs true
		System.out.println(x > z); // Outputs false
		System.out.println(x < a); // Outputs false
	}

}
