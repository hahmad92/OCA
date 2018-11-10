package com.javathreads.chapter3;

public class Account {
	private float total;

	public boolean deduct(float t) {
		if (t <= total) {
			total -= t;
			return true;
		}
		return false;
	}
}