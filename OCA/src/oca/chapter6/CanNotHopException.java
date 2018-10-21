package oca.chapter6;

class CanNotHopException extends Exception {
}

class Hopper {
	public void hop() {
	}

	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}

class Bunny extends Hopper {
	public void hop() throws CanNotHopException {
	} // DOES NOT COMPILE
}