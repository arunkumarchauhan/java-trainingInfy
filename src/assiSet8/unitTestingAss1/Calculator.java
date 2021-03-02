package assiSet8.unitTestingAss1;

public class Calculator {
	static double calculateSimpleInterest(double p, double n, double r)
			throws InvalidPrincipalException, InvalidRateException, InvalidTimeException {
		if (p < 0)
			throw new InvalidPrincipalException("Invalid Principal Exception");
		else if (n < 0)
			throw new InvalidTimeException("InvalidTimeException");
		else if (r < 0)
			throw new InvalidRateException("InvalidRateException");
		return (double) (p * n * r / 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 100.0, n = 5.0, r = -1;
		try {
			double result = calculateSimpleInterest(p, n, r);
			System.out.println(result);
		} catch (InvalidPrincipalException e) {

			System.out.println(e);
		} catch (InvalidRateException e) {
			System.out.println(e);
		} catch (InvalidTimeException e) {
			System.out.println(e);

		}
	}

}
