package assSet6.abstractAss1;

public class DebitCardPayment extends Payment {
	private static int counter;
	private double discountPercentage;

	static {
		counter = 1000;
	}

	public DebitCardPayment(int customerId) {
		// TODO Auto-generated constructor stub
		super(customerId);
		this.setPaymentId("D" + (++counter));

	}

	private static double decideDiscountPercentege(double amount) {
		double discPerc = 0;
		if (amount <= 500)
			discPerc = 1;
		else if (amount > 500 && amount <= 1000)
			discPerc = 2;
		else if (amount > 1000)
			discPerc = 3;
		return discPerc;
	}

	@Override
	public double payBill(double amount) {
		double serviceTax = 0;
		if (amount <= 500)
			serviceTax = 2.5;
		else if (amount > 500 && amount <= 1000)
			serviceTax = 4;
		else if (amount > 1000)
			serviceTax = 5;
		setServiceTaxPercentage(serviceTax);
		discountPercentage = decideDiscountPercentege(amount);
		return amount - amount * discountPercentage / 100 + amount * serviceTax / 100;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
