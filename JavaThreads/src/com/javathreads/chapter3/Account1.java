package com.javathreads.chapter3;

public class Account1 {
	private float total;
	private BusyFlag1 flag = new BusyFlag1();

	public boolean deduct(float t) {
		boolean succeed = false;
		flag.getBusyFlag();
		if (t <= total) {
			total -= t;
			succeed = true;
		}
		flag.freeBusyFlag();
		return succeed;
	}
}