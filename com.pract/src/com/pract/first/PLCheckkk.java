package com.pract.first;

import java.util.Scanner;
class Normal{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String rev = "";
	Normal(String s){
		this.s = s;
		for(int i = s.length() - 1;i >=0;i--) {
			rev += s.charAt(i);
		}System.out.println("reversed string " + rev);
	}
}
public class PLCheckkk {
	public static void main(String[] args) {
		Normal n = new Normal("sai");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev = "";
		boolean isPalindrome = true;
		for(int i = 0;i < s.length() / 2;i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}if(isPalindrome) {
			System.out.println("is palindrome");
		}else {
			System.out.println("Nooo");
		}
		
	}
}
