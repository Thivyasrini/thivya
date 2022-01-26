package com.Greens;

public class Quantity extends Company{

	@Override
	void Designations() {
		System.out.println("number of posting 10");
	}
		

	@Override
	void Qualifications() {
		System.out.println("Need 2020 passed out");
	}

    @Override
	void Salary() {
    	System.out.println("15K to 20K per month");
    }
		
	@Override
	void Place() {
		System.out.println("Location is in chennai");
	}
		
    @Override
	void Employees() {
    	System.out.println("total no.of.canditates selected 100");
    }

	@Override
	void Shifts() {
		System.out.println("Rotational Shifts");
	}

	@Override
	void Scurity() {
		System.out.println("Security in companies 50");
	}
		public static void main(String[] args) {
			Quantity a =new Quantity();
			a.Canditates();
			a.cabs();
			a.Designations();
			a.Employees();
			a.Salary();
			a.Scurity();
			a.Shifts();
			a.Place();
			a.Qualifications();
		}
	}
