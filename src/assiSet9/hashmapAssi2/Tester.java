package assiSet9.hashmapAssi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {

	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
		// Implement your logic here and change the return statement accordingly
		for (String key : mapTwo.keySet()) {
			if (mapOne.containsKey(key) && mapOne.get(key) != mapTwo.get(key)) {
				mapOne.put(key + "new", mapTwo.get(key));
			} else if (!mapOne.containsKey(key)) {
				mapOne.put(key, mapTwo.get(key));
			}
		}

		return mapOne;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Toby", 15);
		mapOne.put("Micheal", 20);
		mapOne.put("Angela", 30);

		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapOne.put("Toby", 15);
		mapTwo.put("Andy", 45);
		mapTwo.put("Micheal", 40);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

	}
}
