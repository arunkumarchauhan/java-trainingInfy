package assSet6.methodOverridingAss2;

public class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;

	public Event(String evenName, String participantName) {
		super();
		this.eventName = evenName;
		this.participantName = participantName;
	}

	public void registerEvent() {
		switch (eventName) {
		case "Singing":
			registrationFee = 8;
			break;
		case "Dancing":
			registrationFee = 10;
			break;
		case "DigitalArt":
			registrationFee = 12;
			break;
		case "Acting":
			registrationFee = 15;
			break;
		default:
			registrationFee = 0;
			break;
		}
	}

	public String getEvenName() {
		return eventName;
	}

	public void setEvenName(String evenName) {
		this.eventName = evenName;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

}