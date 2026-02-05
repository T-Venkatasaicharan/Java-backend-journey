package com.BankinngDemo.Banking;
class Bank{
	String name;
	double balance;
	void deposit(double amount) {
		balance += amount;
	}
	void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
		}else {
			System.out.println("Insufficient balance");
		}
	}
}

public class MainRunner {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.name = "sai";
		bank.balance = 1000;
		bank.deposit(40000);
		System.out.println("Balance : " + bank.balance);
	}

}
