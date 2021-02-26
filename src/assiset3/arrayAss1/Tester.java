package assiset3.arrayAss1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teachers[] = { new Teacher("Alex", "Java Fundamentals", 1200), new Teacher("John", "RDBMS", 800),
				new Teacher("Sam", "Networking", 1200), new Teacher("Maria", "Python", 900) };

		for (Teacher teacher : teachers) {
			System.out.println(teacher.toString());
		}

	}

}
