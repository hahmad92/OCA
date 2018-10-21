package oca.chapter6;

import java.io.IOException;

public class SwallowingException {
	public static void main(String[] args) {
		String textInFile = null;
		try {
			readInFile();
		} catch (IOException e) {
			// ignore exception
		}
		// imagine many lines of code here
		System.out.println(textInFile.replace(" ", ""));
	}

	private static void readInFile() throws IOException, Error{
		throw new IOException();
	}
}
