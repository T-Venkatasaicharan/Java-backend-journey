package com.pract.first;

public class Wrapperclassess {
	public static void main(String[] args) {
		//Wrapper class = provides a way to use primitive data types as reference data types
		//reference data types contain useful methods
		//can be used with collections (e-x: ArrayList)
		//Dis-adv reference data types are slower to access if you need to getr the value of a primitive data type that enclosed with wrapper class it will take more steps
		//java has feature call autoboxing and unboxing
		//autoboxing : the automatic conversion that java compiler makes between the primitive types and their corresponding object wrapper classes
		//unboxing : the reverse of autoboxing. Automatice conversion of wrapper class to primitive
		Boolean a = true;
		System.out.println(a.booleanValue());
		if(a == false) {
			System.out.println("hey");
		}
	}
}
