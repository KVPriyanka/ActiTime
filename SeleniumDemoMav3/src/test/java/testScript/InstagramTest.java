package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookGoogleResultPO;
import pom.InstagramGoogleResultPO;

public class InstagramTest extends BaseTest {

	@Test
	public void SearchPage() {
		try {
			InstagramGoogleResultPO inPo=new InstagramGoogleResultPO(driver);
			inPo.Search("instagram");
			int list=inPo.InallLinks().size();
   System.out.println("Total number of links "+ list);
   inPo.InfrstLnk().click();
   System.out.println(driver.getTitle());
   String eTitle="Instagram";
   inPo.checkTitle(eTitle);
   String aTitle=driver.getTitle();
   Assert.assertEquals(eTitle, aTitle);
	} catch (Exception e) {
		e.printStackTrace();
			Reporter.log("Exception generated",true);
			Assert.fail();
		}	   
	     
		
	}

}
