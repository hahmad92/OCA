package oca.chapter4;

public class VarargsDemo {
	
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
	
	public static void walkString(String start, String... nums) {
		System.out.println(nums.length);
	}
	public static void main(String[] args) {
		walk(1);
		walk(1,2);
		walk(1,2,3,4);
		walk(1,new int [] {12,3,4});
		
		walkString("Hammad","awan",null);

	}

}
