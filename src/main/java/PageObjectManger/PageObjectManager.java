package PageObjectManger;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.HomePage;

public class PageObjectManager extends Baseclass{

	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}
	
	
	// classname objname=new classname();
	
private HomePage HomePage;

public HomePage getHomePage() {
	if (HomePage==null) {//object
		HomePage=new HomePage(driver);
	}
	return HomePage;
}


	
}
