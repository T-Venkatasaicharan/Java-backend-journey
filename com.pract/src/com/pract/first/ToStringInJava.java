package com.pract.first;
class Car{
	String make = "Ford";
	String model = "Mustang";
	String colour = "Red";
	int year = 2021;
	@Override
	public String toString() {
		String myCar = make +"\n" + model + "\n" + "colour" + "\n" + year;
		return myCar;
	}
	
}
public class ToStringInJava {
	public static void main(String[] args) {
// toString() = special method that all objects inherit,
		//     that returns a string that "textually represents" an object.
		// can be used implicitly and explicitly
		Car c = new Car();
		//System.out.println(c.toString());
		System.out.println(c);
		}
}
