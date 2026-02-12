package com.ArraysPractice.Demo;
class P1{
	int n = 5;
	P1(){
	for(int i = 1;i <= n;i++) {
		for(int j = 1;j <= i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
class Pattern2{
	public Pattern2(){
		for(int i = 5;i >= 1;i--) {
			for(int j = 1; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
public class Runner3 {
public static void main(String[] args) {
	//P1 p1 = new P1();
	Pattern2 p2 = new Pattern2();
}
}
