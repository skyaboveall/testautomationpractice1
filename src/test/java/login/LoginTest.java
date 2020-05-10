package login;

import base.BaseTests;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickSubmit();
        String ActualMessage = secureAreaPage.getFlashMessage();
        System.out.println(ActualMessage);
        String ExpectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(ActualMessage,ExpectedMessage);



    }


}
