package com.pract.first;

import java.util.Scanner;

class Find{
	int[] arr = {10,20,30,40,50};
	int max = arr[0];
	int min = arr[0];
	void findMax() {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max in the array: " + max);
	}
	void findMin() {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min in array " + min);
	}
	
}
public class Select {
	public static void main(String[] args) {
		Find f = new Find();
		Scanner sc = new Scanner(System.in);
		System.out.println("To find max: (1) "  );
		System.out.println("To find min: (2) ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 -> f.findMax();
		case 2 -> f.findMin();
		case 3 -> {
			System.out.println("Exit");
			return;
	
		}
		default->
			System.out.println("Exitinggg");
		}
	}

}

