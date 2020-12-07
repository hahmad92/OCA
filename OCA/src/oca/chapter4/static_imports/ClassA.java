package oca.chapter4.static_imports;

public class ClassA {
	public static String NAME = "MIKE";
	
	public static void printName() {
		System.out.println("Class A: name->" + NAME);
	}
	
	public static void printFoo(int a) {
		System.out.println("Class B: name->" + NAME);
	}
}
