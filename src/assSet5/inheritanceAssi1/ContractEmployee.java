package assSet5.inheritanceAssi1;

public class ContractEmployee extends Employee {
	private double wage;
	private float hoursWorked;

	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		super(empId, name);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
		this.calculateSalary();
	}

	public void calculateSalary() {
		this.setSalary(hoursWorked * wage);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
