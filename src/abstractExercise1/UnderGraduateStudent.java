package abstractExercise1;

public class UnderGraduateStudent extends Student {
	public UnderGraduateStudent(String studentName) {
		// TODO Auto-generated constructor stub
		super(studentName);
	}

	@Override
	public void generateResult() {
		int scoreTests[] = this.getTestScores();
		if ((scoreTests[0] + scoreTests[1] + scoreTests[2] + scoreTests[3]) / 4 >= 60)
			this.setTestResult("Pass");
		else
			this.setTestResult("Fail");
	}
}
