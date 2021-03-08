package practiceday.IterationControlStr3;

public class Tester {
	static int gcd(int a, int b) {

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		while (a != b) {
			int temp = a;
			a = b % a;
			b = a;
			if (a == b)
				break;
		}
		return a;
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {
		System.out.println(lcm(20, 15));
	}

}
