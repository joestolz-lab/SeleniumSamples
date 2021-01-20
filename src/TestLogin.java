/***
 * Tests login feature
 */

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 



public class TestLogin {
	
//	System.setProperty("webdriver.chrome.driver", "e:\\Users\\Stolz Parents\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(); 
	// Launch website  


  @Test
  public void testLogin() {
    SignInPage signInPage = new SignInPage(driver);
    HomePage homePage = signInPage.loginValidUser("userName", "password");
 //   assertThat(homePage.getMessageText(), is("Hello userName"));
    Assert.assertEquals( "Hello userName" , homePage.getMessageText());
  }

}
