package com.Greens;

public class StringProgam {
	public static void main(String[] args) {
		
String s ="Work Hard To Achieve";   //syntax of string
		
		//length
		int length =s.length();
		System.out.println(length);
		//char
		char charAt = s.charAt(19);
		System.out.println(charAt);
		//string
		String substring = s.substring(5);
		System.out.println(substring);
		//contains
		boolean contains = s.contains("k");
		System.out.println(contains);
		//equals
		boolean equals =s.equals("Work Hard To Achieve");
		System.out.println(equals);
		//empty
		boolean empty =s.isEmpty();
		System.out.println(empty);
		//concat
		String concat =s.concat("Work Hard");
		System.out.println(concat);
		//replace
		String replace=s.replace("Achieve","Win");
		System.out.println(replace);
		//lastItndex
		int lastIndexOf=s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		//indexof
		int indexof=s.indexOf("o"); //since it starts from 0 
		System.out.println(indexof);
		//endwith 
		boolean endwith=s.endsWith("ve");
		System.out.println(endwith);
		//charArray

	}

}

