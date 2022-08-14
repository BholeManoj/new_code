package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	Date dt = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss:SSS a ");
	String dt1 = sdf.format(dt);
	public String date()
	{
		return dt1;
	}
	public String dateNum()
	{
		String dateNum = dt1.replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
		return dateNum;
	}

}
