package assSet6.abstractAss1;

public class CreditCardPayment extends Payment {
	private static int counter;

	static {
		counter = 1000;
	}

	public CreditCardPayment(int customerId) {
		// TODO Auto-generated constructor stub
		super(customerId);
		setPaymentId("C" + (++counter));
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

	private static double decideTaxPercentege(double amount) {
		double taxPerc = 0;
		if (amount <= 500)
			taxPerc = 3;
		else if (amount > 500 && amount <= 1000)
			taxPerc = 5;
		else if (amount > 1000)
			taxPerc = 6;

		return taxPerc;
	}

	@Override
	public double payBill(double amount) {
		double taxPer = decideTaxPercentege(amount);
		setServiceTaxPercentage(taxPer);
		return amount + amount * taxPer / 100;
	}

}
