package abstractExercise1;

public abstract class Student {

	private String studentName;
	private int testScores[];
	private String testResult;

	public Student(String studentName) {
		super();
		this.studentName = studentName;
		this.testScores = new int[4];

	}

	public abstract void generateResult();

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScores() {
		return testScores;
	}

	public void setTestScore(int testNumber, int testScore) {
		// this.testScores = testScores;
		testScores[testNumber] = testScore;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

}
