package com.pract.first;
class Friends{
	static{
		System.out.println("Man");
	}
	String name;
	static int noOfFriends;
	Friends(String name){
		this.name = name;
		noOfFriends++;
	}
}
public class Static {
	public static void main(String[] args) {
		//static = modifier. A single copy of a variable/method is created and shared
		//    The class "owns " the static member
		Friends f = new Friends("sai");
		System.out.println(Friends.noOfFriends);
		//f.man();
		}
}
