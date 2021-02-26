package assSet5.aggregationAssi2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Josua Khaitan", "khaitan.joshua@infy.com", 'M');
		Book book = new Book("Java Programming", author, 150, 5);
		book.displayBookDetail();
		author.displayAuthorDetails();

	}

}
