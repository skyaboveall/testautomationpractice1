package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
      this.driver= driver;
    }

    private By username = By.id("username");
    private By password = By.id("password");
    private By submit = By.xpath("//*[@id=\"login\"]/button/i");

    public void setUsername(String name){

        driver.findElement(username).sendKeys(name);
    }

    public void setPassword(String pwd){

        driver.findElement(password).sendKeys(pwd);
    }

    public SecureAreaPage clickSubmit(){

        driver.findElement(submit).click();
        return new SecureAreaPage(driver);
    }
}
