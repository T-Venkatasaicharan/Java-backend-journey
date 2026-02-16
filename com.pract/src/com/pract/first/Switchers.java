package com.pract.first;

import java.util.Scanner;

public class Switchers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		switch(day) {
		case "Sunday" : System.out.println("It is sunday");
		break;
		case "Monday" :System.out.println("This is monday");
		break;
		default:System.out.println(day + " This is not a day");
		}
	}
}
