package com.pract.first;

import java.util.Random;

class DiceRoller{
//	public DiceRoller() {
//		// TODO Auto-generated constructor stub
//		Random random = new Random();
//		int num = 0;
//		roll(random,num);
//	}
//	void roll(Random random,int num) {
//		num = random.nextInt(6)+1;
//		System.out.println(num);
//	}
	Random random;
	int num;
	public DiceRoller() {
		// TODO Auto-generated constructor stub
		random = new Random();
		roll();
		
	}
	void roll() {
		num = random.nextInt(6)+1;
		System.out.println(num);
	}
}
public class LocalNInstance {
	public static void main(String[] args) {
		//local variables are declare inside a method belong to method 
		//instance variables belongs to a class and it can be accessed in side a class any where in the method also
		DiceRoller d = new DiceRoller();
		
	}
}
