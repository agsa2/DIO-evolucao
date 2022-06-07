package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter the path");
		String strPath = in.nextLine();
		File path = new File(strPath);
		
		//criar subpasta out e arquivo summary
		String newPath = path.getParent();
		boolean success = new File(newPath + "/out").mkdir();
		
		String newFile = newPath + "/out/sumary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				String[] vet = line.split(",");
				productList.add(new Product(vet[0], Double.parseDouble(vet[1]), Integer.parseInt(vet[2])));
				
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
				for (Product pl : productList) {
					bw.write(pl.getName() + "," + String.format("%.2f", pl.total()));
					bw.newLine();
				}
				
				System.out.println(newFile + " CREATED");
			} 
			catch (IOException e) {
				e.printStackTrace();
			}	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		in.close();
	}

}
