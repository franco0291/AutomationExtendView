package src.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import src.Base.BaseTest;
import src.PageObjects.HomePageObjects;
import src.PageObjects.LoginPageObjects;


public class LoginTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void LoginTest(String username, String password)
    {
        HomePageObjects home = new HomePageObjects(driver);
        home.openPage();
        home.clickLoginButton();
        LoginPageObjects login = new LoginPageObjects(driver);
        login.FillLoginFields(username,password);
        login.getLoginButton();
    }
}

