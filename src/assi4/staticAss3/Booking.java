package assi4.staticAss3;

public class Booking {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked = false;
	private static int seatsAvailable;

	static {
		seatsAvailable = 400;
	}

	public Booking(String customerEmail, int seatsRequired) {

		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		if (seatsAvailable - seatsRequired >= 0) {
			seatsAvailable -= seatsRequired;
			this.isBooked = true;
		}

	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getSeatsRequired() {
		return seatsRequired;
	}

	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public static int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}

}
