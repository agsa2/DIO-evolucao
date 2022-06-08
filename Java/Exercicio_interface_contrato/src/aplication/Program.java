package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalPaymentService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = in.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(in.next());
		System.out.print("Contract value: ");
		double value = in.nextDouble();
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Enter number of installments: ");
		int installments = in.nextInt();
		
		ContractService cs = new ContractService(new PaypalPaymentService());
		
		cs.processContract(contract, installments);
		
		
		System.out.println();
		System.out.print("Installments:");
		for (Installment it : contract.getInstallment()) {
			System.out.println(it);
		}
		
		
		
		in.close();
	}

}
