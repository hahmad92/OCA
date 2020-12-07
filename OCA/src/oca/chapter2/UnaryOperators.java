package oca.chapter2;

import java.util.Arrays;

public class UnaryOperators {

	public static void main(String[] args) {
		boolean x = false;
		System.out.println(x); // false
		x = !x;
		System.out.println(x); // true

		double x1 = 1.21;
		System.out.println(x1); // 1.21
		x1 = -x1;
		System.out.println(x1); // -1.21
		x1 = -x1;
		System.out.println(x1); // 1.21

		x1 = -x1;
		System.out.println(+x1); // 1.21
		
		//int x = !5; // DOES NOT COMPILE
		//boolean y = -true; // DOES NOT COMPILE
		//boolean z = !0; // DOES NOT COMPILE
		
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter); // Outputs 1
		System.out.println(counter); // Outputs 1
		System.out.println(counter--); // Outputs 1
		System.out.println(counter); // Outputs 0
		
		int x2 = 3;
		int y2 = ++x2 * 5 / x2-- + --x2;
		System.out.println("x is " + x2);
		System.out.println("y is " + y2);
		
		double d = 10.90;
		d++;
		System.out.println(d);
		
		incrementDecrementOperators();
	}
	
	public static void incrementDecrementOperators() {
		
		System.out.println("in incrementDecrementOperators");
		
		int data[] = new int[10];
		int x = 0;
		
		data[++x] = 10 + x++ * ++x;
		
		System.out.println(Arrays.toString(data));
		++x =10;
	}

}
