package com.Greens;

public class Invoice implements Incurance {

	@Override
	public void claimed() {
		System.out.println("45 medical insurance");
		
	}

	@Override
	public void newlyadded() {
		System.out.println("97 new insurance");
		
	}

	@Override
	public void rejected() {
		System.out.println("40 claims");
		
	}

	@Override
	public void denied() {
		System.out.println("77 claims");
		
	}

	@Override
	public void balanced() {
		System.out.println("55 claims");
		
	}
public static void main(String[] args) {
	Invoice a = new Invoice();
	a.claimed();
	a.balanced();
	a.denied();
	a.newlyadded();
	a.rejected();
}
}
