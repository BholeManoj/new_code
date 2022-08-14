package Excel_Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ani {
	public static void main(String[] args) throws Exception {

		/*Create File object to read a file*/
		FileInputStream fis = new FileInputStream("D://March_Batch//MavenSuit//Excel//createData.xlsx");
		
		/*Create object of workbook factory (So no to append excel version to workbook interface)*/
		Workbook wb = WorkbookFactory.create(fis);
		
		/*Sheet interface
		 To call particular sheet...*/
		Sheet s = wb.getSheet("WriteInFile");
		
		/*To write the sheet ...
		 1. Select particular and cell
		 2. make Enable edit function of cell
		 3. Write data in cell
		 4. At end close the open file*/
		
		s.getRow(0).createCell(3).setCellValue("Avability");
		s.getRow(1).createCell(3).setCellValue("YES");
		s.getRow(2).createCell(3).setCellValue("NO");
		s.getRow(3).createCell(3).setCellValue("YES");
		
		/*To write the */
		
		FileOutputStream fos= new FileOutputStream("D://March_Batch//MavenSuit//Excel//createData.xlsx");
		
		wb.write(fos);
		fos.close();
	}
}
