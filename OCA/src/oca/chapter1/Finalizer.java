package oca.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
	
public static List objects = new ArrayList();

int i = 9.0;
	protected void finalize()
	{
		System.out.println("finalize");
		objects.add(this);
	// Don't do this
	} 
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hammad Awan");
		{
			Finalizer f = new Finalizer();
			System.out.println(f);
		}
		Thread.sleep(60000);
		System.out.println(objects.get(0));
	}
	
}