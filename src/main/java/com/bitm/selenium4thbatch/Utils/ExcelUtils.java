package com.bitm.selenium4thbatch.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.bitm.selenium4thbatch.DTO.LoginDTO;
import com.bitm.selenium4thbatch.DTO.FlightFinderDTO;

public class ExcelUtils {
	
	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;
	
	private static XSSFSheet getSheet(int sheetNo) throws IOException {
		
		inputStream = new FileInputStream(new File("D:\\Java workspace\\selenium4thbatch(Excel.v2)\\data.xlsx"));
		workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(sheetNo);
		return sheet;
		
	}

	public static List<LoginDTO> getLoginData() throws IOException{
		List<LoginDTO> logins=new ArrayList<LoginDTO>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            LoginDTO logindata=new LoginDTO();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					logindata.setUsername(cell.getStringCellValue());
					cellCounter++;
					break;
				case 1:
					logindata.setPassword(cell.getStringCellValue());
					break;
				default:
					break;
				}               
                 
            }
            logins.add(logindata);
        }
        close();
		return logins;
}
	
	
	public static List<FlightFinderDTO> getFlightFinderData() throws IOException{
		List<FlightFinderDTO> ffs = new ArrayList<FlightFinderDTO>();
		
		DataFormatter formatter = new DataFormatter();
		
		//login is the first sheet in excel so getSheet parameter set to 1
		Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            FlightFinderDTO ffdata = new FlightFinderDTO();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					ffdata.setPassenger_no(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					ffdata.setDepart_from(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					ffdata.setDepart_month(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					ffdata.setDepart_date(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					ffdata.setArrive_in(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					ffdata.setArrive_month(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					ffdata.setArrive_date(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					ffdata.setAirline(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}               
                 
            }
            ffs.add(ffdata);
        }
        close();
		return ffs;
}

	private static void close() throws IOException{
		
		workbook.close();
		inputStream.close();
		
	}
}
