package assSet5.inheritanceAssi1;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experience;

	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		this.calculateMonthlySalary();
	}

	public void calculateMonthlySalary() {

		double variablePay = 0;
		if (experience >= 3 && experience < 5)
			variablePay = 0.05 * basicPay;
		else if (experience >= 5 && experience < 10)
			variablePay = 0.07 * basicPay;
		else if (experience >= 10)
			variablePay = 0.12 * basicPay;

		this.setSalary(this.basicPay + hra + variablePay);

	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

}
