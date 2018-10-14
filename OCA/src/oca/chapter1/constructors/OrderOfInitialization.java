package oca.chapter1.constructors;

public class OrderOfInitialization {
	{
		System.out.println("First Initialization Block");
	}
	private String name = "Fluffy";
	{
		System.out.println("setting field");
		System.out.println(name);
	}

	public OrderOfInitialization() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	private String lastName = "ALoha";

	public static void main(String[] args) {
		OrderOfInitialization chick = new OrderOfInitialization();
		System.out.println(chick.name);
	}
}