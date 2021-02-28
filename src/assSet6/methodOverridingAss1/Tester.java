package assSet6.methodOverridingAss1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

		System.out.println("Teacher Details\n***************");
		System.out.println("Name: " + teacher.getName());
		System.out.println("Qualification: " + teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: " + officeStaff.getName());
		System.out.println("Designation: " + officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);

		// Create more objects for testing your code

	}

}
