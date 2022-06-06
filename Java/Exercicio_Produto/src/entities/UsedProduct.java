package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return name + " (used) $ "+ String.format("%.2f", price) +" (Manufacture date: "+ sdf.format(manufactureDate) + ")";
	}
}






















