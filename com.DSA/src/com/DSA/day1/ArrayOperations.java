package com.DSA.day1;

import java.util.Scanner;

class ArrayOpe{
	int size;
	int arr[];
	Scanner sc = new Scanner(System.in);
	public void createArray() {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is now created");
		System.out.println("---------");
	}
	public void insertData() {
		System.out.println("Insert the data into the array: ");
		for(int i = 0;i < size;i++) {
			System.out.println("Position Number: " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Inserted the data into the array");
		System.out.println("--------");
		
	
	}
	public void deleteData() {

			System.out.println("Enter the number to be deleted: ");
		int data = sc.nextInt();
		int pos = -1;
		for(int i = 0;i < size;i++) {
			if(data == arr[i]) {
				pos = i;
			}
		}
		if(pos >= 0) {
			int res[] = new int[size - 1];
			int k = 0;
			for(int i = 0;i < size;i++) {
				if(pos == i) {
					continue;
				}
				res[k] = arr[i];
				k++;
			}
			System.out.println("The array after deletion is : ");
			for(int i = 0;i < size -1;i++) {
				System.out.println(res[i] + " ");
			}
		}
		else {
			System.out.println("Element not found ");
		}
		System.out.println("Array data is now Deleted");
		System.out.println("------------");
		
	}
	public void updateData() {
		System.out.println("Enter the data to be updated : ");
		int data = sc.nextInt();
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		if(pos > size) {
			System.out.println("Check the position value ");
		}else {
			arr[pos] = data;
			System.out.println("Array data is updated ");
			System.out.println("-------");
		}
	}
	public void display() {
		for(int i =0; i < size;i++) {
			System.out.println(arr[i] +" ");
		}
	}
	
}
public class ArrayOperations {
	public static void main(String[] args) {
		ArrayOpe ao = new ArrayOpe();
		ao.createArray();
		ao.insertData();
		//ao.display();
		ao.deleteData();
		ao.updateData();
		ao.display();
		
		
	}

}
