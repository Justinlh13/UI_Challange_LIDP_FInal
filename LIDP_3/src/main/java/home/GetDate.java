package home;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//class that calls the system to acquire the date 
public class GetDate {
	// creates new date object
	Date date = new Date();
	// formats date
	String strDateFormat = "hh:mm:ss a";
	DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	String formattedDate = dateFormat.format(date);

	// getters and setters
	public String getformattedDate() {
		return formattedDate;
	}

	public void setformattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}
}
