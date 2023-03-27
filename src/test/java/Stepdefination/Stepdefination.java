package Stepdefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import Baseclass.Baseclass;
import PageObjectManger.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefination extends Baseclass {

	PageObjectManager obj=new PageObjectManager(driver);
	
	@Given("launch browser")
	public void launch_browser() {
	    BrowserLaunch("edge");
	}
	@Given("navigate url {string}")
	public void navigate_url(String string) throws IOException {
	    getUrl(PropertyRead(string));
	}
	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
	   Assert.assertTrue(elementIsDispalyed(obj.getHomePage().logo));
	}
	@Then("User Click sigup button")
	public void user_click_sigup_button() {
	    
		driver.findElement(By.id("uploadfile_0"))
		.sendKeys("C:\\Users\\STROM BREAKER\\eclipse-workspace-2022-DEC\\Automation_Revision\\src\\test\\resources\\upload\\th.jpeg");
		
	}
}
