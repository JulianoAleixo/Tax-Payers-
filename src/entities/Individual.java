package entities;

public class Individual extends TaxPayer {
	private Double healthExpenditures;

	// Constructors
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	// Getters and Setters
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	// Methods
	@Override
	public Double totalTax() {
		if (super.getAnualIncome() < 20000) {
			if (this.healthExpenditures > 0) {
				return (super.getAnualIncome() * 0.15) - (this.healthExpenditures * 0.5);
			}
			else {
				return super.getAnualIncome() * 0.15;
			}
		} 
		else {
			if (this.healthExpenditures > 0) {
				return (super.getAnualIncome() * 0.25) - (this.healthExpenditures * 0.5);
			}
			else {
				return super.getAnualIncome() * 0.25;
			}
		}
	}
}
