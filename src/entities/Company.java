package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployees;

	// Constructors
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// Getters and Setters
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	// Methods
	@Override
	public Double totalTax() {
		if (this.numberOfEmployees > 10) {
			return super.getAnualIncome() * 0.14;
		}
		else {
			return super.getAnualIncome() * 0.16;
		}
	}
}
