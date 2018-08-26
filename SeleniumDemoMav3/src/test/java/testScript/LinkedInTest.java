package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.LinkedInGoogleResultPO;

public class LinkedInTest extends BaseTest {
	@Test
	public void SearchPage() {
		
	try {
		LinkedInGoogleResultPO  lnPO=new LinkedInGoogleResultPO(driver);
		lnPO.Search("linkedIn");
		int Lnlist=lnPO.LnallLnk().size();
		System.out.println(" Total number of LinkedIn Links "+Lnlist);
		lnPO.LnfrstLnk().click();
		System.out.println(driver.getTitle());
		String eTitle="LinkedIn: Log In or Sign Up";
		lnPO.checkTitle(eTitle);
		String aTitle=driver.getTitle();
		Assert.assertEquals(eTitle, aTitle);
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.log("Exception generated",true);
		Assert.fail();
	}
	
	

}
}