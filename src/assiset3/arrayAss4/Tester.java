package assiset3.arrayAss4;

public class Tester {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		// Implement your code here
		int i = 0;
		int quotient = 0;
		int remainder = 0;
		if (num1 < num2) {
			while (num1 < num2 && i < numbers.length) {
				num1++;
				if (num1 < 0)
					continue;
				if (num1 / 100 == 0) {
					quotient = num1 / 10;
					remainder = num1 % 10;
					if ((quotient + remainder) % 3 == 0 && (num1 % 5) == 0) {
						numbers[i++] = num1;
					}
				} else
					break;
			}

		}
		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 100;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}

}
