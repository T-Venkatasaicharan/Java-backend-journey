package com.pract.first;

import java.util.Scanner;

public class Runner2 {
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = sc.nextDouble();
		System.out.println("Enter the y: ");
		y = sc.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is : "+ z);
	}
}
