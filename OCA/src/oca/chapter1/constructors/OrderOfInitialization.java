package oca.chapter1.constructors;

public class OrderOfInitialization {
	static int i;
	{
		System.out.println("First Initialization Block");
	}
	private String name = "Fluffy";
	{
		System.out.println("setting field");
		System.out.println(name);
	}

	public OrderOfInitialization() {
		
		System.out.println(i);
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	private String lastName = "ALoha";

	public static void main(String[] args) {
		OrderOfInitialization chick = new OrderOfInitialization();
		System.out.println(chick.name);
	}
}