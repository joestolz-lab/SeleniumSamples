package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage1 {
	  protected static WebDriver driver;

	  // <h1>Hello userName</h1>
	  private By messageBy = By.tagName("h2");
	  private By loginName = By.tagName("td");
	  private By name1 = By.className("heading3") ;
	  private By titleText =By.className("barone");  //for Guru99 Bank


	  public HomePage1(WebDriver driver){
	    HomePage1.driver = driver;
	    //if (!driver.getTitle().equals("Welcome To Manager's Page of Guru99 Bank")) 
	    if (!driver.findElement(name1).getText().equalsIgnoreCase("Welcome To Manager's Page of Guru99 Bank")){
	      throw new IllegalStateException("This is not Home Page of logged in user," +
	            " current page is: " + driver.getCurrentUrl());
	      
	    }
	  }

	  /**
	    * Get message (h1 tag)
	    *
	    * @return String message text
	    */
	  public String getMessageText() {
	    return driver.findElement(messageBy).getText();
	  }

	  public HomePage1 manageProfile() {
	    // Page encapsulation to manage profile functionality
	    return new HomePage1(driver);
	  }

	public String getHomePageDashboardUserName() {
		// grab name for verification
		return driver.findElement(loginName).getText();	
	}
	public String getHeading() {
		return driver.findElement(name1).getText();	
	}
}
