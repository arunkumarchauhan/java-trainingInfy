package assiset3.arrayAss3;

public class Tester {

	static boolean isLeapYear(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return true;
			}
		}
		return false;
	}

	public static int[] findLeapYears(int year) {
		int leapYears[] = new int[15];

		int remainder = year % 4;

		if (!isLeapYear(year)) {
			year += 4 - remainder;
		}

		leapYears[0] = year;
		for (int i = 1; i < 15; i++) {
			leapYears[i] = leapYears[i - 1] + 4;
		}

		return leapYears;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1900;
		int[] leapYears;
		leapYears = findLeapYears(year);
		for (int index = 0; index < leapYears.length; index++) {
			System.out.print(leapYears[index] + "\t");
		}
	}

}
