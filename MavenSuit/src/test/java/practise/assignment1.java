package practise;
import java.io.FileInputStream;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class assignment1 {

	public static void main(String[] args) throws Exception {
		assignment1 obj = new assignment1();
		String em = "om";
		FileInputStream fis = new FileInputStream("./Excel/assign.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("EMDATA");
		HashMap < String , String> hm = new 	HashMap < String , String> ();

	//	System.out.println(hm.size());
		for(int i = 0 ; i<=s1.getPhysicalNumberOfRows();i++)
		{
			String str = s1.getRow(i).getCell(0).getStringCellValue();
			
			if(str.equalsIgnoreCase(em))
			{
				for(int q = 0 ; q<=s1.getRow(0).getLastCellNum();q++)
				{
					String key = s1.getRow(0).getCell(q).getStringCellValue();
					String value = s1.getRow(i).getCell(q).getStringCellValue();
					//System.out.println(key +" =  " +value);
					hm.put(key, value);
		
			
					if(q==6)
					{
						System.out.println(hm);
					}
				}
			
			}
			
		}
	
	}
}
	

