package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Contribuinte> contribuinte = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int payers = in.nextInt();
		
		for (int i=1; i<=payers; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char ch = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name =in.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = in.nextDouble();
			in.nextLine();
			
			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = in.nextDouble();
				contribuinte.add(new Fisica(name, anualIncome, healthExpenditures));
			} 
			else {
				System.out.println("Number of employees: ");
				int numberEmployees = in.nextInt();
				contribuinte.add(new Juridica(name, anualIncome, numberEmployees));
	
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for (Contribuinte c : contribuinte) {
			System.out.println(c.getName() + ": $ " + String.format("%.2f", c.anualIncome()));
			sum += c.anualIncome();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
	}

}
