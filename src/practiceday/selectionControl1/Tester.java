package practiceday.selectionControl1;

class Tester {
	public static void main(String[] args) {
		// Implement your code here

		int x = 2;
		int y = 10;
		int z = 10;
		int total5RsNoteAmount = x * 5;
		int total5NoteUsed = 0;
		int total1NoteUsed = 0;

		total5NoteUsed = z / 5;
		z -= total5NoteUsed * 5;

		if (z <= y) {

			total1NoteUsed = z;
			z -= z;
		}

		if (z != 0) {
			System.out.println("Not Possible");

		} else
			System.out
					.println("No Of 5 rs note used : " + total5NoteUsed + " No Of 1 rs note used : " + total1NoteUsed);

	}
}
