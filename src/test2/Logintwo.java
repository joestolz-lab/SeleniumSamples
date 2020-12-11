package test2;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	import test2.LoginTest2;
	import test2.HomePage1;


public class Logintwo {
	
	    String driverPath = "e:\\Users\\Stolz Parents\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe";  
	    WebDriver driver;
	    LoginTest2 objLogin;


	    @BeforeTest

	    public void setup(){

		System.setProperty("webdriver.gecko.driver", driverPath);
	        
	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");

	    }

	    /**

	     * This test case will login in http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message

	     */

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){

	        //Create Login Page object

	    objLogin = new LoginTest2(driver);

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application

	    objLogin.loginToGuru99("mgr123", "mgr!23");

	    // go the next page

	    HomePage1 objHomePage = new HomePage1(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	    }
}