package com.pract.first;
class Stprac{
	//Strings are the reference data type that can store one or more characters
	// references data types have access to useful methods
	boolean prac() {
		String name = "bro";
		return name.equalsIgnoreCase("Bro");
	}
	void len() {
		String name = "sai";
		System.out.println(name.length());
		char res = name.charAt(1);
		System.out.println(res);
		int ind = name.indexOf('i');
		System.out.println(res);
		//trim method will remove the spaces
		//toUperrcase() method will convert all string in upper case
		//replace(old,new) we can replace old char to new char
		//still there are many inbuilt methods
	}
	
}
public class stringStrings {
	public static void main(String[] args) {
		Stprac p = new Stprac();
		System.out.println(p.prac());
		p.len();
		
		
	}
}
