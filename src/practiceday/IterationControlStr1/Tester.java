package practiceday.IterationControlStr1;

public class Tester {

	public static void main(String[] args) {
		int x = 123;
		int y = 738;
		int multiplication = x;
		int number = x;
		int remainder = 1;

		while (x > 0) {

			remainder = x % 10;
			x = x / 10;

			multiplication = multiplication * remainder;
		}

		if (multiplication == y)
			System.out.println(number + " is Seed of " + y);
		else
			System.out.println(number + " is NOT Seed of " + y);
	}

}
