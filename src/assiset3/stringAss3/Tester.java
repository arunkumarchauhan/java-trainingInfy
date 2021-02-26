package assiset3.stringAss3;

public class Tester {

	// Harder Method
	public static String reverseEachWordWithStringBuilder(String str) {
		// Implement your code here and change the return value accordingly
		String revStringArr[] = str.split(" ");

		String resultString = "";
		for (int i = 0; i < revStringArr.length; i++) {
			StringBuilder stringBuild = new StringBuilder();
			resultString = resultString + " " + stringBuild.append(revStringArr[i]).reverse().toString();

		}

		return resultString;
	}

	// Easier Method
	public static String reverseEachWord(String str) {
		// Implement your code here and change the return value accordingly
		String revStringArr[] = str.split(" ");

		String resultString = "";
		for (int i = 0; i < revStringArr.length; i++) {

			char word[] = revStringArr[i].toCharArray();
			for (int j = 0; j < word.length / 2; j++) {
				char tempChar = word[j];
				word[j] = word[word.length - 1 - j];
				word[word.length - 1 - j] = tempChar;
			}

			String wordStr = new String(word);
			resultString = resultString + " " + wordStr;

		}

		return resultString;
	}

	public static void main(String args[]) {
		String str = "all cows eat grass";
		System.out.println(reverseEachWordWithStringBuilder(str));
		System.out.println(reverseEachWord(str));
	}
}
