package Automation_Class;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class FileWright {
	public static void main(String[] args) throws IOException {
		String name  = "Manoj";
		String Hobby  = "Travel";
		String Designation  = "Automation Engg";
		String Mail  = "manoj.xxxxx@gmail.com";
	      Properties props = new Properties();
	      props.put("Student Name",name);
	      props.put("Hobby", Hobby);
	      props.put("Designation", Designation);
	      props.put("Mail", Mail);
	      String path = "./UploadFile/output.properties";
	      FileOutputStream outputStrem = new FileOutputStream(path);
	      props.store(outputStrem, "This is a sample properties file");
	      System.out.println("Record Store Successful......");
	}
}
