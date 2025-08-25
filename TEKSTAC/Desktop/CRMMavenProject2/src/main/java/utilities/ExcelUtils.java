package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	XSSFWorkbook w;
	XSSFSheet s;
	
	public void setupExcel(String filePath) throws IOException{
		FileInputStream fs = new FileInputStream(filePath);
		w = new XSSFWorkbook(fs);
		s = w.getSheet("Sheet1");
	}
	
	public String getCellData(int r, int c) {
		String data = s.getRow(r).getCell(c).toString();
		return data;
	}
	
	public int getRowCount() {
		int rowCount = s.getPhysicalNumberOfRows();
		return rowCount;
	}
}
