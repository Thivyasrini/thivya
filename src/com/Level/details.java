package com.Level;

public class details extends Employee {
@Override
public void Details() {
	System.out.println("Employee Name");
	super.Details();
}
@Override
	public void Details(float f) {
	System.out.println("50000");
		super.Details(f);
	}
@Override
	public void Details(int A) {
	System.out.println("HR");
		super.Details(A);
	}

public static void main(String[] args) {
	
	details A=new details();
	A.Details();
	A.Details(7f);
	A.Details(50000);
	
}
}


	
