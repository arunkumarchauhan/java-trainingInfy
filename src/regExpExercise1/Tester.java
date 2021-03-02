package regExpExercise1;

public class Tester {
	public static boolean checkNameValidity(String name) {
		// Implement your code here and change the return value accordingly

		String pattern = "^(?=.{2,30}$)([A-Z][a-zA-Z]+)+(\\s[A-Z][a-zA-Z]*)*$";

		if (name.matches(pattern))
			return true;

		return false;
	}

	public static void main(String[] args) {

		// Change the value of name for testing your code with different names
		String name = "St ";
		System.out.println("The name is " + (checkNameValidity(name) ? "valid!" : "invalid!"));
	}
}
