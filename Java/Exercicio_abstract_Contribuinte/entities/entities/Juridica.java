package entities;

public class Juridica extends Contribuinte{

	private Integer numberEmployees;
	
	public Juridica() {
		super();
	}

	public Juridica(String name, double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double anualIncome() {
		if (this.numberEmployees > 10) {
			return this.anualIncome * 0.14;
		}
		else {
			return this.anualIncome * 0.16;
		}
	}
}
