package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int num = in.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkin = sdf.parse(in.next());
			System.out.println("Check-out date (dd/mm/yyyy): ");
			Date checkout = sdf.parse(in.next());
			
			Reservation reservation = new Reservation(num, checkin, checkout);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkin = sdf.parse(in.next());
			System.out.println("Check-out date (dd/mm/yyyy): ");
			checkout = sdf.parse(in.next());
			
			reservation.updateDates(checkin, checkout);
			reservation.toString();
		}
		catch (ParseException e) { //exceção do sdf.parse
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Erro in reservation "+ e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		in.close();
	}

}
