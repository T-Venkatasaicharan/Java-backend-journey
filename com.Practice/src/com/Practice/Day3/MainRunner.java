package com.Practice.Day3;
interface Plane{
	void fly();
	void land();
}
interface Plane1{
	void fly();
}
class Passengerplane implements Plane, Plane1{
	@Override
	public void fly() {
		System.out.println("Flying in air ");		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("land slowly ");
	}
}
public class MainRunner {
	public static void main(String[] args) {
		Passengerplane p = new Passengerplane();
		p.fly();
		p.land();
	}

}
