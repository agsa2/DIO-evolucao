package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner in = new Scanner(System.in);
		
		List<Product> pl = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num = in.nextInt();
		
		for (int i=1;i<=num;i++) {
			System.out.println("Product #"+i+" data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Price: ");
			double price = in.nextDouble();
			
			if (ch == 'c') {
				pl.add(new Product(name, price));
			}
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(in.next());
				pl.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = in.nextDouble();
				pl.add(new ImportedProduct(name,price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product p : pl) {
			System.out.println(p.toString());
		}
		

	}

}























