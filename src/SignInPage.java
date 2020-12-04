
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object encapsulates the Sign-in page.
 */
public class SignInPage {
  private static WebDriver driver;

  // <input name="user_name" type="text" value="">
  private By usernameBy = By.name("user_name");
  // <input name="password" type="password" value="">
  private By passwordBy = By.name("password");
  // <input name="sign_in" type="submit" value="SignIn">
  private By signinBy = By.name("sign_in");

  public SignInPage(WebDriver driver){
	  this.setDriver(driver);
  }

  /**
    * Login as valid user
    *
    * @param userName
    * @param password
    * @return HomePage object
    */
  public HomePage loginValidUser(String userName, String password) {
    getDriver().findElement(usernameBy).sendKeys(userName);
    getDriver().findElement(passwordBy).sendKeys(password);
    getDriver().findElement(signinBy).click();
    return new HomePage(getDriver());
  }

public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	SignInPage.driver = driver;
}
}
