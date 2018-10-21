package oca.chapter6;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		String type = "moose";
		Object obj = type;
		Integer number = (Integer) obj;

	}

}
