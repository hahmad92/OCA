package oca.chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingSecondException {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
		} catch (IOException e) {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException inner) {
			}
		}
	}

	private static FileReader read() throws IOException {
		// CODE GOES HERE
	}

}
