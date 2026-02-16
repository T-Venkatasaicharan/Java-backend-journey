package com.pract.first;

public class Runner {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int max = arr[0];
		int secLarg = arr[0];
		int min = arr[0];
		int secMin = arr[0];
		for(int num : arr) {
			if(num > max) {
				secLarg = max;
				max = num;
			}else if (num > secLarg && num != max) {
				secLarg = num;
			}
			if(num < min) {
				secMin = min;
				min = num;
			}
		}
	}

}
