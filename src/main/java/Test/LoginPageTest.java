package Test;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {



    @Test(priority = 1)
    public void testLoginFeature(){
       String title=  page.getInstance(LoginPage.class).getLoginPageTitle();
        System.out.println("Login Page title is " + title);
        Assert.assertEquals(title,"Your Store");
        //return loginPage class method
    }
}
