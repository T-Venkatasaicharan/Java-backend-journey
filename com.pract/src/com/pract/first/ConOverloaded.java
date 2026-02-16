package com.pract.first;
class Pizza{
	String bread;
	String sause;
	String cheese;
	String tooping;
	Pizza(String bread,String sause,String cheese,String tooping){
		this.bread = bread;
		this.sause = sause;
		this.cheese = cheese;
		this.tooping = tooping;
	}
	Pizza(String bread,String sause){
		this.bread = bread;
		this.sause = sause;
	}
}
public class ConOverloaded {
	public static void main(String[] args) {
		//overloaded constructors = multiple constructors within a class with the same name,but different parameters
		// name + parameters = signature
		Pizza p2 = new Pizza("garlic","chilli sause");
		Pizza pizza = new Pizza("normal","tammato","amul cheese","garlic ");
		System.out.println("This is your  pizza :" );
		System.out.println(p2.bread);
		System.out.println(pizza.sause);
		System.out.println(pizza.cheese);
		System.out.println(pizza.tooping);
	}
}
