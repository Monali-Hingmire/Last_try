package TestcasesP5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Allpages.loginpage;

//session-80
public class TC01 extends loginpage {

//	public static void main(String[] args) throws IOException, InterruptedException {
//		String emailid="";
//		String passowrd="";
//		String path="C:\\Users\\Shree\\Downloads\\NareshIT\\Testdata.xlsx";
//		//we have creating object for fileinput  stream with path
//		FileInputStream fs=new FileInputStream(path);
//		//we have creating object for XSSFWorkbook  stream with fileinputstream object
//		XSSFWorkbook workbook=new XSSFWorkbook(fs);
//		//create an object for  XSSFSheet and by using getSheet
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
//		//identify how many no of rows are there in sheet
//		int rows=sheet.getLastRowNum();
//		for(int i=1;i<=rows;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			emailid=row.getCell(0).getStringCellValue();
//			passowrd=row.getCell(1).getStringCellValue();
//		
//		
//		browserInitialization();
//		enteremailid(emailid);
//		enterpassword(passowrd);
//		clicklogin();
//		verify_title("Facebook");
//		Thread.sleep(3000);
//		int cellcount =sheet.getRow(i).getLastCellNum();
//		XSSFCell cell=sheet.getRow(i).createCell(cellcount);
//		//sc.assertAll();//will print all error messages
//		if(verify_errormessage("Find your account and log in.")==true)
//		{
//			cell.setCellValue("passed");
//		}
//		else
//		{
//			cell.setCellValue("failed");
//		}
//		
//		}
//		fs.close();
//		FileOutputStream fout=new FileOutputStream(path);
//		workbook.write(fout);
//		fout.close();
//		}
//	

}
