package interfaceExercise1;

public class Seller implements Tax {
	private String location;
	private double taxPercentage;

	public Seller(String locatoion) {
		// TODO Auto-generated constructor stub
		this.location = locatoion;
	}

	public double calculateTax(double price) {

		double taxPer = 0.0;
		if (location.equals("Middle east"))
			taxPer = 15;
		else if (location.equals("Europe"))
			taxPer = 25;
		else if (location.equals("Canada"))
			taxPer = 22;
		else if (location.equals("Japan"))
			taxPer = 12;
		taxPercentage = taxPer;

		return price + taxPer * price / 100;

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

}
