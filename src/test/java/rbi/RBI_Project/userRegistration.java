package rbi.RBI_Project;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.Scenario;
import cucumber.api.java.*;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import auto.framework.ConfigProvider;

import java.util.concurrent.TimeUnit;

public class userRegistration {

	String url;
	WebDriver driver = Utils.driver;
	WebDriverWait wait = null; 
	

		
	
	@Given("^I open the browser and access webshop$")
	public void navigateToSalesforce() throws Throwable{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		System.setProperty("webdriver.chrome.driver", ConfigProvider.getDriverPath());
		driver = new ChromeDriver(capabilities);
		url = dataFactory.getInstance().getApplicationUrl();
		driver.get(url);
		driver.manage().window().maximize();

	}	
	
	@When("^I click on \"([^\"]*)\"$")
	public void clickOnLink(String title) throws Throwable {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='"+title+"']"))).click();
	}
	
	@Then("^I am on the \"([^\"]*)\" page$")
	public void checkPageTitle(String title) throws Throwable {
		wait = new WebDriverWait(driver, 5);
		Assert.assertEquals(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[text()='"+title+"']"))).getText(),title);
		
	}
	
	@And("^I fill the \"([^\"]*)\" field with \"([^\"]*)\"$")
	public void fillInputField(String title, String value) throws Throwable {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='"+title+"']/..//input"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='"+title+"']/..//input"))).sendKeys(value);
	}
	
	@And("^I set the Gender field to \"([^\"]*)\"$")
	public void setRadioButton(String gender) throws Throwable {
		wait = new WebDriverWait(driver, 5);
		if (gender.equals("Male")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='M']"))).click();
		}
		else{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='F']"))).click();
		}
		

	}
	

	@And("^Close driver$")
	public void closeBrowser() throws Throwable {
		try{
			driver.close();
		}catch (Exception error){
			//Do Nothing
		}
	}
	



}
