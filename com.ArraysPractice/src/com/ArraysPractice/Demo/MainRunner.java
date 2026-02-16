package com.ArraysPractice.Demo;

import java.util.ArrayList;

public class MainRunner {
	public static void main(String[] args) {
		try {
	ArrayList<Integer> ar = new ArrayList<>();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	ar.add(1, 30);
	ar.add(20);
	ar.remove(Integer.valueOf(10));
	System.out.println(ar);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
