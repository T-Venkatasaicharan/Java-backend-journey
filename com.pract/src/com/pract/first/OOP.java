package com.pract.first;
class Human{
	String name;
	int age;
	double weight;
	Human(String name,int age,double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;		
	}
	void eat() {
		System.out.println(this.name + " is Eating ");
	}
	void drink() {
		System.out.println(this.name + " is drinking water");
	}
}
public class OOP {
	public static void main(String[] args) {
		Human man1 = new Human("sai",21,69);
		System.out.println(man1.name);
		man1.eat();
		man1.drink();
	}

}
