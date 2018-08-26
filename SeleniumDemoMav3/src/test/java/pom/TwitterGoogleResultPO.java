package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class TwitterGoogleResultPO extends BasePage {

	public TwitterGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="q")
	private WebElement googleTxtBx;
	public WebElement googleTxtBx() {
		return googleTxtBx;
	}
	
	@FindBy(xpath="//a")
	private List<WebElement> TwtallLnk;
	public List<WebElement> TwtallLnk(){
		return TwtallLnk;
	}

	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement TwtfrstLnk;
	public WebElement TwtfrstLnk() {
		return TwtfrstLnk;
	}
	
	public void Search(String lnk) {
		googleTxtBx().sendKeys(lnk);
		googleTxtBx.sendKeys(Keys.ENTER);
	}
	
}
