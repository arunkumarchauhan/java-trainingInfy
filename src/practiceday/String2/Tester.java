package practiceday.String2;

import java.util.HashMap;

class Tester {
	public static String removeDuplicatesandSpaces(String str) {
		// Implement your code here and change the return value accordingly

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);
		for (char c : map.keySet()) {
			if (map.get(c) > 1) {
				str = str.replace(c, ' ');
			}
		}
		str = str.replaceAll(" ", "");
		return str;
	}

	public static void main(String args[]) {
		String str = "object oriented programming";
		str = "That is a String";
		System.out.println(removeDuplicatesandSpaces(str));
	}
}
