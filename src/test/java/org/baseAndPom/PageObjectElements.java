package org.baseAndPom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectElements extends BaseClass {
	public PageObjectElements() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement userId;
	@FindBy(id="txtPassword")
	private WebElement userPassword;
	@FindBy(id="btnLogin")
	private WebElement login;
	@FindBy(xpath="//b[contains(text(),'Recruitment')]")
	private WebElement Requirement;
	@FindBy(id="candidateSearch_jobTitle")
	private WebElement jobtitle;
	@FindBy(id="candidateSearch_jobVacancy")
	private WebElement jobVacancy;
	@FindBy(id="candidateSearch_hiringManager")
	private WebElement Manager;
	@FindBy(id="candidateSearch_status")
	private WebElement status;
	@FindBy(id="candidateSearch_candidateName")
	private WebElement candidateName;
	@FindBy(id="candidateSearch_keywords")
	private WebElement candidateKeyword;
	@FindBy(id="candidateSearch_fromDate")
	private WebElement startDate;
	@FindBy(id="candidateSearch_toDate")
	private WebElement toDate;
	@FindBy(id="candidateSearch_modeOfApplication")
	private WebElement application;
	@FindBy(id="btnSrch")
	private WebElement search;
	@FindBy(id="btnAdd")
	private WebElement Add;
	@FindBy(id="addCandidate_firstName")
	private WebElement firstName;
	@FindBy(id="addCandidate_lastName")
	private WebElement lastName;
	@FindBy(id="addCandidate_vacancy")
	private WebElement candidateVacancy;
	@FindBy(id="addCandidate_email")
	private WebElement email;
	@FindBy(id="addCandidate_contactNo")
	private WebElement contactNumber;
	@FindBy(id="btnSave")
	private WebElement save;
	@FindBy(id="addCandidate_resume")
	private WebElement resume;
	
	public WebElement getUserId() {
		return userId;
	}
	public WebElement getUserPassword() {
		return userPassword;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getRequirement() {
		return Requirement;
	}
	public WebElement getJobtitle() {
		return jobtitle;
	}
	public WebElement getJobVacancy() {
		return jobVacancy;
	}
	public WebElement getManager() {
		return Manager;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getCandidateName() {
		return candidateName;
	}
	public WebElement getCandidateKeyword() {
		return candidateKeyword;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getToDate() {
		return toDate;
	}
	public WebElement getApplication() {
		return application;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getAdd() {
		return Add;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCandidateVacancy() {
		return candidateVacancy;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContactNumber() {
		return contactNumber;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getResume() {
		return resume;
	}
	
}
//public static String excelRead(String sheet, int row, int column) throws IOException {
//	File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\OpenOrange.xlsx");
//	FileInputStream stream = new FileInputStream(f);
//	Workbook w = new XSSFWorkbook(stream);
//	Sheet s = w.getSheet(sheet);
//	Row r = s.getRow(row);
//	Cell c = r.getCell(column);
//	int cellType = c.getCellType();
//	String data = null;
//	if(cellType==1) {
//	 data = c.getStringCellValue();
//	}
//	else if(DateUtil.isCellDateFormatted(c)) {
//		Date dateCellValue = c.getDateCellValue();
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		data = sf.format(dateCellValue);
//	}
//	else {
//		double numericCellValue = c.getNumericCellValue();
//		long l = (long)numericCellValue;
//		String.valueOf(l);
//	}
//	return data;
//}
