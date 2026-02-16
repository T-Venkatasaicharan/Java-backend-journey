package com.ArraysPractice.Demo;
class Sum{
	int sum;
	int[] arr = {10,2,30,40};
	int large = 0;
	Sum(){
	for(int i = 0; i < arr.length;i++) {
		sum = sum + arr[i];
	}
	System.out.println(sum);
}
	int Large(){
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > large) {
				large = arr[i];
			}
		}
		return large;
		
	}
}
public class Runner4 {
	public static void main(String[] args) {
		Sum s = new Sum();
		//Sum ss = new Sum();
		s.Large();
		System.out.println(s.large);
	}

}
