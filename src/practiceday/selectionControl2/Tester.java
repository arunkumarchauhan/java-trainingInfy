package practiceday.selectionControl2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tester {

	public static void main(String[] args) {
		String dt = "29-02-2008"; // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.add(Calendar.DATE, 1); // number of days to add
		dt = sdf.format(c.getTime());
		System.out.println(dt);

	}

}
