package com.Level;

public class Quantity extends Home_appliance{
	@Override
	public void chair() {
		System.out.println("Chair 50");
	super.chair();
	}
	@Override
	public void dinningtable() {
		System.out.println("Dinning table 67");
     super.dinningtable();
	}
	@Override
	public void fan() {
		System.out.println("Fan 77");
		super.fan();
	}
	@Override
	public void sofa() {
		System.out.println("Sofa 90");
		super.sofa();
	}
	public static void main(String[] args) {
		Quantity a=new Quantity();
		a.chair();
		a.dinningtable();
		a.fan();
		a.sofa();
	}

}
