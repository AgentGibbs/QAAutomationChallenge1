package testPackage;

import org.testng.*;
import org.testng.asserts.*;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QAAutomation1 {
	
	public WebDriver browserDriver;
	private String baseUrl;
	private String verifyTitle;
	private String actualTitle;
	@BeforeTest
	public void setUp(){
		baseUrl= "https:////www.skiutah.com//";
		verifyTitle = "Ski Utah - Ski Utah";
	}
	
@Test
public void verifyFirefox()
{
    browserDriver = new FirefoxDriver();
    browserDriver.get(baseUrl);
    
    actualTitle = browserDriver.getTitle();
    System.out.println(actualTitle);
    Assert.assertEquals(verifyTitle,actualTitle );
    
    browserDriver.close();
    
}

@Test
public void verifyChrome()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Christian Gibbs\\Java Libraries\\selenium-2.53.0\\chromedriver.exe");
    browserDriver = new ChromeDriver();
    browserDriver.get(baseUrl);
    String actualTitle = browserDriver.getTitle();
    System.out.println(actualTitle);
    System.out.println(verifyTitle);
    Assert.assertEquals(verifyTitle,actualTitle );
    
    browserDriver.close();
    
}

@Test
public void verifyIE()
{
	System.setProperty("webdriver.ie.driver","C:\\Users\\Christian Gibbs\\Java Libraries\\selenium-2.53.0\\ieDriverServer.exe");
    browserDriver = new InternetExplorerDriver();
    browserDriver.get(baseUrl);
    String actualTitle = browserDriver.getTitle();
    Assert.assertEquals(verifyTitle,actualTitle );
    
    browserDriver.close();
    
}	

}
