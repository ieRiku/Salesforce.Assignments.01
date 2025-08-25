package tests;

import java.io.IOException;

import base.BaseClass;
import utilities.ExcelUtils;


public class BookApplication extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ExcelUtils.setupExcel("src/test/resources/Data.xlsx");
		int row = ExcelUtils.getRowCount();
		for(int i=1;i<row;i++) {
			String user = ExcelUtils.getCellData(i, 0);
			String pass = ExcelUtils.getCellData(i, 1);
			
			System.out.println(user +" "+ pass);
		}
	}
}
