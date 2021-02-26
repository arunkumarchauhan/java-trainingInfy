package assSet5.aggregationAssi2;

public class Author {
	private String name;
	private String email;
	private Character gender;

	public Author(String name, String email, Character gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public void displayAuthorDetails() {
		System.out.println("Author [name=" + name + ", email=" + email + ", gender=" + gender + "]");
	}

}
