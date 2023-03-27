package Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class HomePage extends Baseclass{
	
	public HomePage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//img[contains(@src,'logo.png')]")
	public WebElement logo;
	
	@FindBy(xpath = "//img[contains(@src,'logo.png')]")
	public List<WebElement> logos;
	
}
