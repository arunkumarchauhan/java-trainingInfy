package assSet6.methodOverridingAss2;

public class TeamEvent extends Event {

	private int noOfParticipants;
	private int teamNo;

	public TeamEvent(String evenName, String participantName, int noOfParticipants, int teamNo) {
		super(evenName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}

	@Override
	public void registerEvent() {
		switch (this.getEvenName()) {
		case "Singing":
			this.setRegistrationFee(4 * this.noOfParticipants);
			break;
		case "Dancing":
			this.setRegistrationFee(6 * noOfParticipants);
			break;
		case "DigitalArt":
			this.setRegistrationFee(8 * noOfParticipants);
			break;
		case "Acting":
			this.setRegistrationFee(10 * noOfParticipants);
			break;
		default:
			this.setRegistrationFee(0);
			break;
		}
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

}
