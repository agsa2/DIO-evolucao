package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Pedido;
import entities.Product;
import entitiesEnum.OrderStatus;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Email: ");
		String email = in.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(in.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(in.next());

		Pedido order = new Pedido(new Date(), status, client);
				
		System.out.println("How many items to this order? ");
		int qtdItem = in.nextInt();
		for (int i=1; i<= qtdItem; i++) {
			System.out.println("Enter #"+ i + " item data:");
			System.out.print("Product name: ");
			in.nextLine();
			String productName = in.nextLine();
			System.out.print("Product price: ");
			double price = in.nextDouble();
			System.out.print("Quantity: ");
			int quantity = in.nextInt();
			
			Product product = new Product(productName, price);
			
			OrderItem oi = new OrderItem(quantity, price, product);
			
			order.addItems(oi);	
		}
		
		
		System.out.println(order.toString());
		
	}

}
