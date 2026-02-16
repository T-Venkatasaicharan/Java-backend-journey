package com.pract.first;
import java.util.Random;
public class Runner3 {
public static void main(String[] args) {
	//int num = 1 + (int)(Math.random() * 10000);
	//System.out.println(num);
	Random r = new Random();
	//int x = r.nextInt(6)+ 1;
	//double x = r.nextDouble();
	boolean x = r.nextBoolean();
	System.out.println(x);
	}
}
