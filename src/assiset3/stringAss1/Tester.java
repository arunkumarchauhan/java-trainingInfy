package assiset3.stringAss1;

public class Tester {

	static boolean isAlphabet(char character) {

		return character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z' ? true : false;
	}

	public static String moveSpecialCharacters(String str) {
		// Implement your code here and change the return value accordingly
		char[] strArr = str.toCharArray();
		char tempChar;
		for (int i = 0; i < strArr.length; i++) {
			if (isAlphabet(strArr[i]))
				continue;
			else {
				int alphabetIndex = i;
				boolean foundAlphabetChar = false;
				while (alphabetIndex < strArr.length) {

					if (isAlphabet(strArr[alphabetIndex])) {
						foundAlphabetChar = true;
						break;
					}

					alphabetIndex++;

				}
				if (foundAlphabetChar) {
					tempChar = strArr[i];
					strArr[i] = strArr[alphabetIndex];
					strArr[alphabetIndex] = tempChar;

				}
			}
		}

		return new String(strArr);
	}

	public static void main(String args[]) {
		String str = "He@#$llo!*&";
		System.out.println(moveSpecialCharacters(str));
		str = "%$Wel*&come!";
		System.out.println(moveSpecialCharacters(str));
	}

}
