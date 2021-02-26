package assSet5.aggregationAssi1;

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, long contactNumber, String address) {
		super();

		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public Customer(String customerId, String customerName, long contactNumber, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public void displayCustomerDetail() {
		System.out.println("Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", address=" + address + "]");

	}

	public double payBill(double totalPrice) {
		return 0;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
