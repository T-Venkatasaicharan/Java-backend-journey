package com.BankinngDemo.Banking;
import java.util.Scanner;
class Bank{
	private double balance;
	public Bank(double initalBalance) {
		this.balance = initalBalance;
	}
	public void checkBalance() {
		System.out.println("Current balance : " +  balance);
	}
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than zero.");
			return;
		}
		balance += amount;
		System.out.println("Deposite sucessful.");
		checkBalance();
	}
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than zero.");
			return;
		}
		if (amount > balance) {
			System.out.println("Insufficient balance.");
			return;
		}
		balance -= amount;
		System.out.println("Withdrawal sucessful");
		checkBalance();
	}
}
public class MainRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank account = new Bank(1000);
		while(true) {
			showMenu();
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				account.checkBalance();
				break;
			case 2:
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter withdrawal amount: ");
				double withdrawalAmount = sc.nextDouble();
				account.withdraw(withdrawalAmount);
			case 4:
				System.out.println("Thank you for using the application.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid option. please try again");
			}
			System.out.println();
		}
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("--Banking Menu--");
		System.out.println("1. check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		
	}

}
