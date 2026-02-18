package com.pract.first;
class Food{
	String name;
	Food(String name){
		this.name = name;
	}
}
public class ArrayOfTheObjects {
	public static void main(String[] args) {
		Food[] freez = new Food[3];
		Food f1 = new Food("rice");
		Food f2 =new Food("pizza");
		freez[0] = f1;
		freez[1] = f2;
		for(int i = 0;i < freez.length;i++) {
			System.out.println(freez[i].name);
		}
		//System.out.println();a		
	}
}
