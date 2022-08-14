package Automation_Class;
import java.text.SimpleDateFormat;
import java.util.Date;
public class date {
	public static void main(String[] args) {
		Date dt= new Date();
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/YYYY HH:MM:ss:SSS a ");
		String d=sdf.format(dt);
		System.out.println(d);
		d=d.replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
		System.out.println(d);
	}
	public String getCurrentDateAndTime(String format ){
		SimpleDateFormat sdf=new SimpleDateFormat("dd//MM/yyyy HH:MM:ss:SSS a ");
		return sdf.format(new Date());
	}
    public String getUniqueNo(String format ) {
    	SimpleDateFormat sdf=new SimpleDateFormat("dd//MM/yyyy HH:MM:ss:SSS a ");
		String d=sdf.format(new Date());
	      return d.replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
    }
}


