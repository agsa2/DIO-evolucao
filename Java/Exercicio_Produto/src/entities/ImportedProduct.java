package entities;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (Customs fee: $ " + String.format("%.2f", price) + ")";
	}
}


















