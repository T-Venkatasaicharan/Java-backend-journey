package com.pract.first;

import java.util.Scanner;

public class Nestedloops {
	public static void main(String[] args) {
		//Nested loop is just a loop inside a loop
		int rows;
		int column;
		String symbol;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		rows = sc.nextInt();
		System.out.println("Enter no of columns");
		column = sc.nextInt();
		System.out.println("Enter the symblo need to be printed");
		symbol = sc.next();
		for(int i = 1;i <= rows;i++) {
			for(int j = 1; j <= column;j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
	}
}
