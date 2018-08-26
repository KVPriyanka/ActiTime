package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookGoogleResultPO;

public class FacebookTest extends BaseTest{
	@Test
	public void SearchPage() {
		try {
			//driver.get(TEST_URL);
			FacebookGoogleResultPO facePO=new FacebookGoogleResultPO(driver);
			facePO.Search("facebook");
			int fblist=facePO.fballLinks().size();
             System.out.println("Total number of Facebook links "+ fblist);
             facePO.fbfrstLnk().click();
              System.out.println(driver.getTitle());
                String eTitle="Facebook – log in or sign up";
               facePO.checkTitle(eTitle);
                String aTitle=driver.getTitle();
                Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Exception generated",true);
			Assert.fail();
		}	   
	     
		
	}

}
