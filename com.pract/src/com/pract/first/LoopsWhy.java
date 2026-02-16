package com.pract.first;

import java.util.Scanner;

public class LoopsWhy {
	public static void main(String[] args) {
		// While loop = executes a block of code as long as it's condition remains true
		Scanner sc = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.println("Enter your name");
			name = sc.nextLine();
		}
		System.out.println("Heyy! " + name);
		
		// do while do block will execute at least one time either the condition will become true or false
		// for loop = executes a block of code a limited of time 
		for(int i = 0; i <= 10;i++) {
			System.out.println("hey");
		}
		for(int i = 10;i >=0;i--) {
			System.out.println(i);
		}
		System.out.println("Happy shivarathri  " + name);
	}
}
