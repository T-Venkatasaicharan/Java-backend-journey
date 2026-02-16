package com.Practice.Day3;

import java.util.Scanner;

class ATM{
	double amount;
	Scanner sc = new Scanner(System.in);
	void balance() {
		System.out.println("Enter the amount to deposit: ");
		double amount = sc.nextDouble();
		System.out.println(amount + " is current balance.");
	}
	void withdrawal() {
		
	}
//	void star() {
//		for(int i = 0; i <= 5;i++) {
//			for(int j = 0; j < i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
}
public class MainRunner2 {
	public static void main(String[] args) {
		ATM a = new ATM();
		a.balance();
		//a.star();
	}

}
