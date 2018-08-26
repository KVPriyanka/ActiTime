package pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class InstagramGoogleResultPO extends BasePage{

	public InstagramGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="q")
	private WebElement googleTxtBx;
	public WebElement googleTxtBx() {
		return googleTxtBx;
	}

	@FindBy(xpath="//a")
	private List<WebElement> InallLinks;
	public List<WebElement> InallLinks(){
		return InallLinks;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement InfrstLnk;
	public WebElement InfrstLnk() {
		return InfrstLnk;
	}
	public void Search(String lnk) {
		googleTxtBx().sendKeys(lnk);	
		googleTxtBx.sendKeys(Keys.ENTER);


		}

}
