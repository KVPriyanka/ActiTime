package testScript;

import java.nio.channels.AsynchronousServerSocketChannel;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.TwitterGoogleResultPO;

public class TwitterTest extends BaseTest{
@Test
public void SearchPage() {
	try {
		TwitterGoogleResultPO twPO=new TwitterGoogleResultPO(driver);
		twPO.Search("twitter");
		int twtlist=twPO.TwtallLnk().size();
		System.out.println("Total number of Twitter links " +twtlist);
		twPO.TwtfrstLnk().click();
		System.out.println(driver.getTitle());
		String eTitle="Login on Twitter";
		twPO.checkTitle(eTitle);
		String aTitle=driver.getTitle();
		Assert.assertEquals(eTitle, aTitle);
	} catch (Exception e) {
		e.printStackTrace();
		Reporter.log("Exception generated",true);
		Assert.fail();
	
	}
	
}
}