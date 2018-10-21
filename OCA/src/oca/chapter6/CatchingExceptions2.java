package oca.chapter6;

public class CatchingExceptions2 {

	class AnimalsOutForAWalk extends RuntimeException {
	}

	class ExhibitClosed extends RuntimeException {
	}

	class ExhibitClosedForLunch extends ExhibitClosed {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void visitSnakes() {
		try {
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.print("runtime exception");
		} catch (ExhibitClosed e) {// DOES NOT COMPILE
			System.out.print("not today");
		} catch (Exception e) {
			System.out.print("exception");
		}
	}

	private void seeAnimal() {
		// TODO Auto-generated method stub

	}

}
