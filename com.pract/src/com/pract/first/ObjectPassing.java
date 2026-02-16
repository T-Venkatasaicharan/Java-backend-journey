package com.pract.first;
class Garage{
	void park(Car1 c) {
		//this.name = c;
		System.out.println("The " + c.name + " is parked in the garage!");
	}
	void toService(Car1 c) {
		System.out.println("The "+ c.name + " need to get Service!");
	}
	boolean toService = true; 
	void completed(Car1 c) {
		System.out.println("The " + c.name + " completed the service.");
	}
}
class Car1{
	String name;
	Car1(String name){
		this.name = name;
	}
}
public class ObjectPassing {
	public static void main(String[] args) {
		Garage g = new Garage();
		Car1 c = new Car1("BMW");
		Car1 c2 = new Car1("Tesla");
		g.park(c2);
		g.park(c);
		g.toService(c);
		System.out.print("\n");
		g.completed(c);
		
	}

}
