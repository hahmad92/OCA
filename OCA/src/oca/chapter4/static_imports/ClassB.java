package oca.chapter4.static_imports;

public class ClassB {

public static String NAME1 = "JHON";
	
	public static void printName(int a) {
		System.out.println("Class A: name->" + NAME1);
	}
	
	public static void printFoo(int a) {
		System.out.println("Class A: name->" + NAME1);
	}
}
