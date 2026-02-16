package com.pract.first;

public class Methods {
	public static void main(String[] args) {
		//method = a block of code that is executed whenever it is called upon
		hello();
		System.out.println(add());
	}
	static void hello() {
		System.out.println("Hello");
	}
	static int add() {
		return 10+20;
	}
	static int add(int x,int y) {
		return x + y;
	}
	//overloaded methods = methods that share the same name but have different prameters
	//                     method name + parameters = method signature
}
