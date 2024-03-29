package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public ExcelDemo(String filePath) throws IOException {
		this.file = new File(filePath);
		this.fis = new FileInputStream(file);
		this.wb = new XSSFWorkbook(fis);
		
	}
	public String getStringData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber);
		this.cell = row.getCell(cellNumber);
		return this.cell.getStringCellValue();
	}
	
	public int getLastRowNumber() {
		return sheet.getLastRowNum();
	}

}
