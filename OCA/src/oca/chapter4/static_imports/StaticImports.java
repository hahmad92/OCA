package oca.chapter4.static_imports;

import static oca.chapter4.static_imports.ClassA.*;
import static oca.chapter4.static_imports.ClassC.*;
import static oca.chapter4.static_imports.ClassB.*;
public class StaticImports {

	//public final static String CITY;
	
	public StaticImports(){
		//CITY = "Lahore";
	}
	public static void main(String[] args) {

		System.out.println(NAME);
		printName();
	}
	
	public void displayData() {
		System.out.println(NAME);
		printName();
	}

}
