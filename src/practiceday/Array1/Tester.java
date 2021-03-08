package practiceday.Array1;

class Emp {
	String name;
	char gender;
	double salary;

	public Emp(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public Emp(String name) {
		super();
		this.name = name;
	}

}

class Validator {
	public int student[] = { 101, 102, 103 };

	public void validate(int id) {
		try {
			for (int i = 0; i <= student.length; i++) {
				int stdid = student[i];
				if (stdid == id)
					System.out.println("p");
			}
		} finally {
			System.out.println("Q");
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		Validator v = new Validator();
		try {
			v.validate(101);
			System.out.println("R");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("S");
		} finally {
			System.out.println("T");
		}
	}

}
