package interfaceExercise1;

public class PurcahseDetails implements Tax {
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;

	public PurcahseDetails(String purchaseId, String paymentType) {
		super();
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}

	public double calculateTax(double price) {

		double taxPer = 0.0;
		if (paymentType.equals("Debit Card"))
			taxPer = 2;
		else if (paymentType.equals("Credit Card"))
			taxPer = 3;
		else
			taxPer = 4;
		taxPercentage = taxPer;
		return price + taxPer * price / 100;

	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

}
