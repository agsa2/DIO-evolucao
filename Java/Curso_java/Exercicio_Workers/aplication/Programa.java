package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departName = in.nextLine();
		System.out.println("Enter work data:");
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Level: ");
		String workerLevel = in.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = in.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departName));
		
		
		System.out.print("How many contracts to this worker? ");
		int contracts = in.nextInt();
		
		for (int i=1; i<=contracts; i++) {
			System.out.println("Enter contract #"+ i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(in.next());
			System.out.print("Value per hours: ");
			double valueHour = in.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = in.nextInt();
			HourContract contract = new HourContract(contractDate, valueHour, hours);	
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = in.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year  = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for"+ monthAndYear + ": "+ String.format("%.2f", worker.income(year, month)));	
	}
}
