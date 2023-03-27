package Baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sample extends Baseclass{
public static void main(String[] args) {
	BrowserLaunch("edge");
	getUrl("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TShirt\n");
	
	List<WebElement> name = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println(name.size());
	for (int i = 0; i < name.size(); i++) {
		System.out.println(name.get(i).getText()+"==="+price.get(i).getText());
	}
}
}
