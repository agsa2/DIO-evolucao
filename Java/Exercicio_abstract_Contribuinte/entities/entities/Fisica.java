package entities;

public class Fisica extends Contribuinte{

	private double healthExpenditures;
	
	public Fisica() {
		super();
	}

	public Fisica(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double anualIncome() {
		if (this.anualIncome < 20000) {
			if (this.healthExpenditures > 0) {	
				return (this.anualIncome * 0.15) - (this.healthExpenditures * 0.5);
			}
			return this.anualIncome * 0.15;
		}
		else {
			if (this.healthExpenditures > 0) {
				return (this.anualIncome * 0.25) - (this.healthExpenditures *0.5);
			}
			return this.anualIncome * 0.25;
		}
	}
	
}
