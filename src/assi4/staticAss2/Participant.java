package assi4.staticAss2;

public class Participant {
	private String registrationId;
	private static int counter;
	private String name;
	private long contactNo;
	private String city;
	static {
		counter = 10000;
	}

	public Participant(String name, long contactNo, String city) {
		// TODO Auto-generated constructor stub
		this.registrationId = "D" + (++counter);
		this.name = name;
		this.contactNo = contactNo;
		this.city = city;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Participant.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
