package assSet6.methodOverridingAss1;

public class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;

	public Faculty(String name, float basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonusPercentage = 0.04f;
		this.carAllowancePercentage = 0.025f;
	}

	public double calculateSalary() {
		return basicSalary + bonusPercentage * basicSalary + carAllowancePercentage * basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}

}
