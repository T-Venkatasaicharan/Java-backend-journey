package com.Practice.Day3;
class Cal{
	double a;
	double b;
	void sum() {
		System.out.
		println(10 + 2);
	}
	void div(int a,int b) {
		System.out.println(a / b);
	}
	double mul() {
		a = 22;
		b = 76;
		double mul =  a * b;
		return mul;
	}
	int sum(int a,int b) {
		return a +b;
	}
}
public class MainRuuner3 {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.div(8,2);
		c.mul();
		System.out.println(c.mul());
		System.out.println(c.sum(2,4));
	}
}
