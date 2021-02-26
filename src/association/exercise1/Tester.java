package association.exercise1;

class CabServiceProvider {
	// Implement your code here
	private String providerName;
	private int noOfTaxies;

	public CabServiceProvider(String providerName, int noOfTaxies) {
		// TODO Auto-generated constructor stub
		this.providerName = providerName;
		this.noOfTaxies = noOfTaxies;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double calculateRewardPrice(Driver driver) {
		double bonusAmt = 0;
		double rating = driver.getAverageRating();
		switch (this.providerName) {
		case "Halo":
			if (rating >= 4.5 && rating <= 5)
				bonusAmt = 10 * rating;
			else if (rating >= 4 && rating < 4.5)
				bonusAmt = 5 * rating;
			break;

		case "Aber":
			if (rating >= 4.5 && rating <= 5)
				bonusAmt = 8 * rating;
			else if (rating >= 4 && rating < 4.5)
				bonusAmt = 3 * rating;
			break;

		default:
			bonusAmt = 0;
			break;
		}
		return Math.round(bonusAmt * 100) / 100;
	}

}

class Driver {

	private String driverName;
	private float averageRating;

	public Driver(String driverName, float averageRating) {
		this.driverName = driverName;
		this.averageRating = averageRating;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public float getAverageRating() {
		return this.averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	// DO NOT MODIFY THE METHOD
	// Your exercise might not be verified if the below method is modified
	public String toString() {
		return "Driver\ndriverName: " + this.driverName + "\naverageRating: " + this.averageRating;
	}
}

class Tester {

	public static void main(String args[]) {
		CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);

		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: " + driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus > 0)
				System.out.println("Bonus: $" + bonus + "\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}

		// Create more objects of CabServiceProvider and Driver classes for testing your
		// code

	}
}
