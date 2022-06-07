package entities;

public class Product {

	private String name;
	private double price;
	private Integer qtd;
	
	public Product() {
	}

	public Product(String name, double price, Integer qtd) {
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public double total() {
		return price * qtd;
	}
}
