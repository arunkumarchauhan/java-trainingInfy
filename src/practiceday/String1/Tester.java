package practiceday.String1;

import java.util.HashMap;
import java.util.Map;

class Tester {

	public static int findHighestOccurrence(String str) {
		// Implement your code here and change the return value accordingly
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int max = 0;
		for (int count : map.values())
			if (max < count)
				max = count;
		return max;
	}

	public static void main(String args[]) {
		String str = "success";
		System.out.println(findHighestOccurrence(str));
	}
}