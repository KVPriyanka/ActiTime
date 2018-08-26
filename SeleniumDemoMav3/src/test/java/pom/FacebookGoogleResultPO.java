package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import library.BasePage;

public class FacebookGoogleResultPO extends BasePage{

	public FacebookGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="q")
	private WebElement googleTxtBx;
	public WebElement googleTxtBx() {
		return googleTxtBx;
	}
	
	
		@FindBy(xpath="//a")
		private List<WebElement> fballLinks;
		public List<WebElement> fballLinks(){
			return fballLinks;
		}
	
		@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
		private WebElement fbfrstLnk;
		public WebElement fbfrstLnk() {
			return fbfrstLnk;
		}
    
 public void Search(String lnk) {
googleTxtBx().sendKeys(lnk);	
googleTxtBx.sendKeys(Keys.ENTER);


}
}
