package com.ArraysPractice.Demo;

public class Runner2 {
public static void main(String[] args) {
	int n = 4;
	for(int i = 0; i <= n -1 ;i++) {
		System.out.print("*");
	}
	System.out.println();
	int i = 1;
	while(i <= 5) {
		System.out.print("@");
		i++;
	}
	System.out.println();
	int a = 1;
	do {
		System.out.print("&");
		a++;
	}while(a <= 5);
	System.out.println();
}
}
