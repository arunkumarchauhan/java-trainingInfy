package assiSet8.regexpAssi1;

public class Tester {
	public static boolean checkPasswordValidity(String password) {
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		if (password.matches(pattern))
			return true;
		return false;
	}

	public static void main(String[] args) {

		// Change the value of password for testing your code with different passwords
		String password = "P@$sW0rd";
		// password = "Alex marry2@";
		System.out.println("The password is " + (checkPasswordValidity(password) ? "valid!" : "invalid!"));
	}
}
