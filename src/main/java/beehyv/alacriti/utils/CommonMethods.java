package beehyv.alacriti.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonMethods {
	public static DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");

	public static void main(String args[]) {
		System.out.println(currentDate());
		System.out.println(futureDateselection());
	}
	public static String currentDate(){

		Date date = new Date();
		return dateFormat.format(date).toString();
	}
	
	public static String futureDateselection(){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 15);
		return dateFormat.format(c.getTime());
	}

}	

