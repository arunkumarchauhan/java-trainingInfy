package assiset3.stringAss2;

public class Tester {
	public static boolean checkPalindrome(String str) {
		// Implement your code here and change the return value accordingly
		int indexL = 0, indexR = str.length() - 1;

		while (indexL < indexR) {
			if (str.charAt(indexL) != str.charAt(indexR)) {
				return false;
			}
			indexL++;
			indexR--;
		}
		return true;
	}

	static void printResult(String str) {
		if (checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

	public static void main(String args[]) {
		String str1 = "radar", str2 = "apple";
		printResult(str1);
		printResult(str2);

	}
}
