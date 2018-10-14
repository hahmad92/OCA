package oca.chapter1.constructors;

public class Chick {
	public Chick() {
		System.out.println("in constructor");
	}

	public void Chick() {
		System.out.println("Not a constructor");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		chick.Chick();
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("In finalize Method");
	}

}
