package com.budgetcarinsurance.stepdefs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.budgetcarinsurance.pages.WelcomePage;
import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import junit.framework.AssertionFailedError;

public class Stepdefs {

	
	private WebDriver driver;
	
//	 @Before
//	 public void startBrowser(){
//	 System.setProperty("webdriver.chrome.driver",	 "C:\\driver\\chromedriver.exe");
//	 WebDriver driver = new ChromeDriver();
//	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	 }
//	
//	 @After
//	 public void stopBrowser() {
//	 driver.close();;
//	 }

	
	private WelcomePage welcomePage;

	@Given("^I am on the Welcome page$")
	public void i_am_on_the_Welcome_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver",	 "C:\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.budgetinsurance.com/Car/B139/NLE");
		welcomePage = PageFactory.initElements(driver, WelcomePage.class);

	}

	@When("^I enter following values in welcome screen$")
	public void i_enter_following_values_in_welcome_screen(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		welcomePage.enterFirstName(data.get(1).get(1));
		welcomePage.enterSurname(data.get(2).get(1));
		welcomePage.selectDOBDay(data.get(3).get(1));
		welcomePage.selectDOBMonth(data.get(4).get(1));
		welcomePage.selectDOBYear(data.get(5).get(1));
		welcomePage.enterHouseNumber(data.get(6).get(1));
		welcomePage.enterPostCode(data.get(7).get(1));
		welcomePage.enterVehicleRegistrationNumber(data.get(8).get(1));

	}

	@When("^I complete the welcome page$")
	public void I_complete_the_welcome_page(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		welcomePage.selectTitle(data.get(1).get(1));
		welcomePage.enterFirstName(data.get(2).get(1));
		welcomePage.enterSurname(data.get(3).get(1));
		welcomePage.selectDOBDay(data.get(4).get(1));
		welcomePage.selectDOBMonth(data.get(5).get(1));
		welcomePage.selectDOBYear(data.get(6).get(1));
		welcomePage.enterHouseNumber(data.get(7).get(1));
		welcomePage.enterPostCode(data.get(8).get(1));
		welcomePage.enterVehicleRegistrationNumber(data.get(9).get(1));

	}

	@When("^I click continue button$")
	public void i_click_continue_button() throws Throwable {
		welcomePage.clickContinueButton();

	}

	@Then("^I should see error message \"([^\"]*)\"$")
	public void i_should_see_error_message(String arg1) throws Throwable {
		String errorMessage = welcomePage.getSinglelargeErrorMessage();
		Assert.assertTrue(errorMessage, true);
		//(errorMessage.contains(arg1));
		
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
		Assert.assertTrue(welcomePage.getBringtext(), true);
	}

	@When("^I click on the FindAddress Button$")
	public void i_click_on_the_FindAddress_Button() throws Throwable {
		welcomePage.clickFindAddress();
	}
	
	 @When("^I click retrieve a saved quote$")
	 public void i_click_retrieve_a_saved_quote() throws Throwable {
		 welcomePage.clickRetrieveQuote();
	 }

	@Then("^I should see the following validation message$")
	public void i_should_see_the_following_validation_message(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		Assert.assertTrue(welcomePage.getTitleErrorMessage(), true);
		Assert.assertTrue(welcomePage.getFirstNameErrorMessage(), true);
		Assert.assertTrue(welcomePage.getSurnameErrorMessage(), true);
		Assert.assertTrue(welcomePage.getHouseErrorMessage(), true);
		Assert.assertTrue(welcomePage.getPostCodeErrorMessage(), true);

	}
	
	@Then("^I should see text \"([^\"]*)\"$")
	public void i_should_see_text(String arg1) throws Throwable {
	    Assert.assertTrue(welcomePage.getBringtext().contains(arg1));
	}

	@Then("^I should see the \"([^\"]*)\" page$")
	public void i_should_see_the_page(String arg1) throws Throwable {
		welcomePage.navigateToAboutYouPage();

	}

}
