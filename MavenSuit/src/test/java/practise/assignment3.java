package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assignment3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String pathName = "./Excel/assign.xlsx";
		FileInputStream fs = new FileInputStream(pathName);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s1 = wb.getSheet("EMDATA");
		int randRowNum = s1.getLastRowNum();
		HashMap<String, Object> map = new HashMap<String, Object>();
		int randNo = (int) (Math.random() * (randRowNum));
		System.out.println(randNo);
		for (int i = 0; i < s1.getRow(0).getLastCellNum(); i++) {
			String key = s1.getRow(0).getCell(i).getStringCellValue();
			CellType cellType = s1.getRow(randNo - 1).getCell(i).getCellType();
			switch (cellType) {
			case BOOLEAN:
				Boolean boolVal = s1.getRow(randNo - 1).getCell(i).getBooleanCellValue();
				map.put(key, boolVal);
				break;

			case NUMERIC:
				long numVal = (long) s1.getRow(randNo - 1).getCell(i).getNumericCellValue();
				map.put(key, numVal);
				break;

			case STRING:
				String strVal = s1.getRow(randNo - 1).getCell(i).getStringCellValue();
				map.put(key, strVal);
				break;

			case FORMULA:
				String forVal = s1.getRow(randNo - 1).getCell(i).getCellFormula();
				map.put(key, forVal);
				break;
			default:
				System.out.println("Invalid entry..");
			}
		}
		System.out.println(map.get("first_name"));

	}

}