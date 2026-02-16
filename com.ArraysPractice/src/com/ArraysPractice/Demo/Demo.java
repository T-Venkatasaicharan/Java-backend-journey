package com.ArraysPractice.Demo;

import java.util.Arrays;

class Car{
	String name;

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
public class Demo {
public static void main(String[] args) {
	Car[] c = new Car[3];
	for(int i = 0;i < c.length;i++) {
		c[i] = new Car();
	}
	c[0].name = "bmw";
	c[1].name = "audi";
	c[2].name = "maruti suziki ";
	System.out.println(Arrays.toString(c));
}
}
