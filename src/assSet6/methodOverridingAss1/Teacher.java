package assSet6.methodOverridingAss1;

public class Teacher extends Faculty {
	private String qualification;

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	@Override
	public double calculateSalary() {
		float totalSal = this.getBasicSalary() + this.getBonusPercentage() * this.getBasicSalary()
				+ this.getCarAllowancePercentage() * this.getBasicSalary();

		if (qualification.equals("Doctoral"))
			totalSal += 20000.0;
		else if (qualification.equals("Masters"))
			totalSal += 18000.0;
		else if (qualification.equals("Bachelors"))
			totalSal += 15500.0;
		else if (qualification.equals("Associate"))
			totalSal += 15500.0;

		return totalSal;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
