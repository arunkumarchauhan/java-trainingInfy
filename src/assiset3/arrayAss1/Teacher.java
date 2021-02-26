package assiset3.arrayAss1;

public class Teacher {
	private String name;
	private String subject;
	private double salary;

	public Teacher(String name, String subject, double salary) {
		this.name = name;
		this.salary = salary;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Subject : " + subject + ", Salary : " + salary + "L";
	}

}
