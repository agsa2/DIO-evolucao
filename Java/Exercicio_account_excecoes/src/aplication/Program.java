package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = in.nextInt();
		System.out.print("Holder: ");
		in.nextLine();
		String holder = in.nextLine();
		System.out.print("Initial balance: ");
		double balance = in.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = in.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);     
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = in.nextDouble();
		try {
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f%n", account.getBalance());
			
		}
		catch (WithdrawException e) {
			System.out.println("Whithdraw error: " + e.getMessage());
		}
		
		
		
		in.close();
	}
	
}
