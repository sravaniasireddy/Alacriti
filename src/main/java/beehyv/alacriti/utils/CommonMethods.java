package beehyv.alacriti.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonMethods {
	public static DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");

	public static void main(String args[]) {
		currentDate();
		futureDateselection();
//		selectedStartDate();
//		selectedEndDate();
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
	
//	public static String selectedStartDate(){
//		Date date = new Date();
//        return dateFormat1.format(date).toString();
//	}
//	
//	public static String selectedEndDate(){
//		Calendar c = Calendar.getInstance();
//		c.add(Calendar.DATE, 15);
//        return dateFormat1.format(c.getTime());
//	}
//	
}	

