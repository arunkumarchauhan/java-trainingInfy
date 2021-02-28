package abstractExercise1;

public class GraduateStudent extends Student {

	public GraduateStudent(String studentName) {
		// TODO Auto-generated constructor stub
		super(studentName);
	}

	@Override
	public void generateResult() {
		int scoreTests[] = this.getTestScores();
		if ((scoreTests[0] + scoreTests[1] + scoreTests[2] + scoreTests[3]) / 4 >= 70)
			this.setTestResult("Pass");
		else
			this.setTestResult("Fail");
	}
}
