package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LinkedInGoogleResultPO extends BasePage {

	public LinkedInGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	 @FindBy(name="q")
	 private WebElement googleTxtBx;
	 public WebElement googleTxtBx() {
		 return googleTxtBx;
	 }
	 
	 @FindBy(xpath="//a")
	 private List<WebElement> LnallLnk;
	 public List<WebElement> LnallLnk() {
		 return LnallLnk;
	 }

	 @FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	 private WebElement LnfrstLnk;
	 public WebElement LnfrstLnk() {
		 return LnfrstLnk;
	 }
	 
	 public void Search(String lnk) {
		 googleTxtBx().sendKeys(lnk);
		 googleTxtBx.sendKeys(Keys.ENTER);
	 }
}
