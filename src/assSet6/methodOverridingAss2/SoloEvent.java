package assSet6.methodOverridingAss2;

public class SoloEvent extends Event {
	private int participantNo;

	public SoloEvent(String evenName, String participantName, int participantNo) {
		super(evenName, participantName);
		this.participantNo = participantNo;
	}

	@Override
	public void registerEvent() {
		super.registerEvent();
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

}
