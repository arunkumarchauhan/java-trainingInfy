package assSet6.methodOverridingAss1;

public class OfficeStaff extends Faculty {
	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}

	@Override
	public double calculateSalary() {
		float totalSal = this.getBasicSalary() + this.getBonusPercentage() * this.getBasicSalary()
				+ this.getCarAllowancePercentage() * this.getBasicSalary();

		switch (designation) {
		case "Accountant":
			totalSal += 10000.0;
			break;
		case "Clerk":
			totalSal += 7000.0;
			break;
		case "Peon":
			totalSal += 4500.0;
			break;

		}
		return totalSal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
