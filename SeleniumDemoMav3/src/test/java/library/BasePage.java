package library;


import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
		}
	public void checkTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is Matching",true);
		} catch (Exception e) {
			Reporter.log("Title is not Matchimg",true);
			}
	}
    public void checkWebElement(WebElement element) {
    	try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Weblement is present",true);
		} catch (Exception e) {
			Reporter.log("WebElement is not present",true);
		}
    }
}
