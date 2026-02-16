package com.pract.first;

import java.util.ArrayList;
class Arraylist2D{
	Arraylist2D(){
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("cup cake");
		bakeryList.add("honey cake");
		bakeryList.add("vaneila cake");
		System.out.println(bakeryList);
//		System.out.println(bakeryList.getFirst());
//		System.out.println(bakeryList.getLast());
//		System.out.println(bakeryList.get(0));
		ArrayList<String> productList = new ArrayList();
		productList.add("onions");
		productList.add("chille");
		productList.add("Egg");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("Thumps Up");
		drinkList.add("coce");
		drinkList.add("Milk");
		
		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		System.out.println(groceryList.get(0).get(2));
		
	}
}
public class ARRRAYLISTT {
	public static void main(String[] args) {
		Arraylist2D a = new Arraylist2D();
		System.out.println();
		System.out.println();
		//Array list = a resize-able array.
		//          Elements can be added and removed after compilation phase
		//          store references data types
		ArrayList<String> food = new ArrayList<>();
		food.add("new");
		food.add("re assign");
		food.set(0, "set"); //we can set a value at certain index
		food.remove(0); //we can remove value by using remove method by providing index
		food.clear(); //it will clear all the array
		for(int i = 0;i < food.size();i++) {
			System.out.println(food.get(i));
		}
	}
}
