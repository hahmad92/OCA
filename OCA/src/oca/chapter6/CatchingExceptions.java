package oca.chapter6;

public class CatchingExceptions {

	class AnimalsOutForAWalk extends RuntimeException {
	}

	class ExhibitClosed extends RuntimeException {
	}

	class ExhibitClosedForLunch extends ExhibitClosed {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void visitPorcupine() {
		try {
			seeAnimal();
		} catch (AnimalsOutForAWalk e) {// first catch block
			System.out.print("try back later");
		} catch (ExhibitClosed e) {// second catch block
			System.out.print("not today");
		}
	}

	private void seeAnimal() {
		// TODO Auto-generated method stub
		
	}

}
