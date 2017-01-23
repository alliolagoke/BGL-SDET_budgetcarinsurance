package com.budgetcarinsurance.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	private WebDriver driver;

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements

	// WebElement

	@FindBy(id = "input_1-1")
	private WebElement listTitle;

	@FindBy(id = "input_1-2")
	private WebElement inputFirstName;

	@FindBy(id = "input_1-3")
	private WebElement inputSurname;

	@FindBy(id = "input_1-4_d")
	private WebElement listDOBDay;

	@FindBy(id = "input_1-4_m")
	private WebElement listDOBMonth;

	@FindBy(id = "input_1-4_y")
	private WebElement listDOBYear;

	@FindBy(id = "input_1-5_house")
	private WebElement inputHouseNumber;

	@FindBy(id = "input_1-5_pcode")
	private WebElement inputPostCode;

	@FindBy(id = "findAddressButton_1-5")
	private WebElement buttonFindAddress;

	@FindBy(id = "input_1-6")
	private WebElement inputVehicleRegistrationNumber;

	@FindBy(xpath = ".//*[@id='QuestionSetViewModel']/div[3]/a/p")
	private WebElement ContinueButton;

	@FindBy(xpath = "TermsandConditionList popupLink")
	private WebElement linkTermsandCondition;

	@FindBy(xpath = "popupLink")
	private WebElement linkQuoteAcceptanceInformation;

	@FindBy(id = "retrieveQuoteRedirectLink")
	private WebElement linkRetrieveQuote;

	@FindBy(className="autoSingleErrorLargeMessage")
	private WebElement LbSinglelargeErrorMessage;

	@FindBy(className="autoSingleErrorSmallMessage")
	private WebElement LbSingleSmallErrorMessage;

	@FindBy(className = "autoValidationTitle_For_MOTOR__filtered_Answer_list")
	private WebElement LbTitleErrorMessage;
	
	@FindBy(className = "asideBody")
	private WebElement LbBringText;
	
	@FindBy(className="autoMultipleErrorLargeMessage")
	private WebElement LbMultiplelargeErrorMessage;

	@FindBy(className="autoMultipleErrorSmallMessage")
	private WebElement LbMultipleSmallErrorMessage;
	
	@FindBy(className="autoValidationFirstNames")
	private WebElement LbFirstNameErrorMessage;
	
	@FindBy(className="autoValidationSurname")
	private WebElement LbSurnameErrorMessage;

	@FindBy(className="autoValidationRiskAddress_house")
	private WebElement LbHouseErrorMessage;
	
	@FindBy(className="autoValidationRiskAddress_pcode")
	private WebElement LbPostCodeErrorMessage;
	
	/*
	 * Defining all the user actions that can be performed in the WelcomePage
	 * 
	 * in the form of methods
	 */

	// Methods

	
	public void selectTitle(String title) {
		Select dropdown = new Select(listTitle);
		dropdown.selectByValue(title);
	}

	public String getSelectedTitle() {
		Select dropdown = new Select(listTitle);
		WebElement selectedItem = dropdown.getFirstSelectedOption();
		return selectedItem.getAttribute("text");
	}

	public void clearFirstName() {
		inputFirstName.clear();
	}

	public void enterFirstName(String firstname) {
		inputFirstName.sendKeys(firstname);
	}

	public void clearSurname() {
		inputSurname.clear();
	}

	public void enterSurname(String surname) {
		inputSurname.sendKeys(surname);
	}

	public void selectDOBDay(String day) {
		Select dropdown = new Select(listDOBDay);
		dropdown.selectByValue(day);
	}

	public String getSelectedDOBDay() {
		Select dropdown = new Select(listDOBDay);
		WebElement selectedItem = dropdown.getFirstSelectedOption();
		return selectedItem.getAttribute("value");
	}

	public void selectDOBMonth(String month) {
		Select dropdown = new Select(listDOBMonth);
		dropdown.selectByValue(month);
	}

	public String getSelectedDOBMonth() {
		Select dropdown = new Select(listDOBMonth);
		WebElement selectedItem = dropdown.getFirstSelectedOption();
		return selectedItem.getAttribute("value");
	}

	public void selectDOBYear(String year) {
		Select dropdown = new Select(listDOBYear);
		dropdown.selectByValue(year);
	}

	public String getSelectedDOBYear() {
		Select dropdown = new Select(listDOBYear);
		WebElement selectedItem = dropdown.getFirstSelectedOption();
		return selectedItem.getAttribute("value");
	}
	
	public void completeDateOfBirth(String dateOfBirth) {
		String[] dateOfBirthParts = dateOfBirth.split("/");
		Select listDay = new Select(listDOBDay);
		Select listMonth = new Select(listDOBMonth);
		Select listYear = new Select(listDOBYear);
		listDay.selectByVisibleText(dateOfBirthParts[0]); 		
		listMonth.selectByVisibleText(dateOfBirthParts[1]); 		
		listYear.selectByVisibleText(dateOfBirthParts[2]); 		
	}	
	
	public String getDateOfBirth(){
		Select listDay = new Select(listDOBDay);
		Select listMonth = new Select(listDOBMonth);
		Select listYear = new Select(listDOBYear);		
		WebElement selectedDay =  listDay.getFirstSelectedOption();
		WebElement selectedMonth =  listMonth.getFirstSelectedOption();
		WebElement selectedYear =  listYear.getFirstSelectedOption();
		return selectedDay.getAttribute("text") + "/" + selectedMonth.getAttribute("text") + "/" + selectedYear.getAttribute("text");
	}	

	public void completeDOB(String dob) {
		selectDOBDay(dob);
		selectDOBMonth(dob);
		selectDOBYear(dob);
	}

	public void clearHouseNumber() {
		inputHouseNumber.clear();
	}

	public void enterHouseNumber(String houseNumber) {
		inputHouseNumber.sendKeys(houseNumber);
	}

	public void clearPostCode() {
		inputPostCode.clear();
	}

	public void enterPostCode(String postCode) {
		inputPostCode.sendKeys(postCode);
	}

	public void clickFindAddress() {
		buttonFindAddress.click();
	}

	public void clearVehicleRegistrationNumber() {
		inputVehicleRegistrationNumber.clear();
	}

	public void enterVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		inputVehicleRegistrationNumber.sendKeys(vehicleRegistrationNumber);
	}

	public void clickContinueButton() {
		ContinueButton.click();
	}

	public void clickTermsandCondition() {
		linkTermsandCondition.click();
	}

	public void clickRetrieveQuote(){
		linkRetrieveQuote.click();
	}
	
	public void completeWelcomePage(String title, String firstname, String surname, String dateOfBirth, String housenumber,
			String postcode, String vehicleRegistrationNumber) {
		selectTitle(title);
		enterFirstName(firstname);
		enterSurname(surname);
		completeDateOfBirth(dateOfBirth);
		enterHouseNumber(housenumber);
		enterPostCode(postcode);
		enterVehicleRegistrationNumber(vehicleRegistrationNumber);
	}

//	public void submitWelcomePage() {
//		completeWelcomePage(String title, String firstname, String surname, String dateOfBirth, String housenumber,
//				String postcode, String vehicleRegistrationNumber);
//		clickContinueButton();
//	}

	// public PersonalDetailsPage submitWelcomePage() {
	// completeWelcomePage();
	// clickContinueButton();
	// return PageFactory.initElements(driver, PersonalDetailsPage.class);
	// }
	

	
	public String getSinglelargeErrorMessage(){
		return LbSinglelargeErrorMessage.getText();
	}
	
	public String getSingleSmallErrorMessage(){
		return LbSingleSmallErrorMessage.getText();
	}
	
	public String getBringtext(){
		return LbBringText.getText();
	}
	
	public String getTitleErrorMessage(){
		return LbTitleErrorMessage.getText();
	}

	public String getMultipleLargeErrorMessage(){
		return LbMultiplelargeErrorMessage.getText();
	}
	
	public String getMultipleSmallErrorMessage(){
		return LbMultipleSmallErrorMessage.getText();
	}
	
	public String getFirstNameErrorMessage(){
		return LbFirstNameErrorMessage.getText();
	}
	
	public String getSurnameErrorMessage(){
		return LbSurnameErrorMessage.getText();
	}
	
	public String getHouseErrorMessage(){
		return LbHouseErrorMessage.getText();
	}
	
	public String getPostCodeErrorMessage(){
		return LbPostCodeErrorMessage.getText();
	}
	
	
	public AboutYouPage navigateToAboutYouPage() {
	//	completeWelcomePage(getSelectedTitle(), firstname, surname, dateOfBirth, housenumber, postcode, vehicleRegistrationNumber);
		return PageFactory.initElements(driver, AboutYouPage.class);
	}
	
	public RetrieveQuotePage navigateToRetrieveQuotePage() {
		clickRetrieveQuote();
			return PageFactory.initElements(driver, RetrieveQuotePage.class);
		}	
	
}