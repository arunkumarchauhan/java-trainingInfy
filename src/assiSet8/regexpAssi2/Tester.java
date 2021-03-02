package assiSet8.regexpAssi2;

public class Tester {
	static boolean checkWebAddressValidity(String webAddress) {
		String pattern = "^https?://(www[.])?([a-zA-Z0-9])+[.](com|in|gov|org|net|edu)$";
		if (webAddress.matches(pattern))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webAddress = "http://www.abc.com";
		System.out.println("The web address is " + (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
	}

}
