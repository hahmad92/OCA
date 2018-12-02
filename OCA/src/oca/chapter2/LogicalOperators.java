package oca.chapter2;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
		
		if(a&b) {
			System.out.println("result");
		}
		if(a|b) {
			System.out.println("result1");
		}
		if(a^b) {
			System.out.println("result2");
		}
		
		
		int x = 6;
		boolean y = (x >= 6) || (++x <= 7);
		System.out.println(x);
		System.out.println(y);

	}

}
