package com.pract.first;

import java.util.Scanner;

public class logicaloperator {
	public static void main(String[] args) {
		//logical operators = used to connect two or more expressions
		// && and || or ! not
		int temp = 20;
		if(temp >30) {
			System.out.println("It is to hot");
		}else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm out side ");
		}else {
			System.out.println("It is cool out side"  );
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("You are playing a game! press q or Q to quite");
		char response = sc.next().charAt(0);
		if(response == 'q' || response =='Q') {
			System.out.println("You qite the game");
		}else {
			System.out.println("Still you are playing");
		}
	}

}
