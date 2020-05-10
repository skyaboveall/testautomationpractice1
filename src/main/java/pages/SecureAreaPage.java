package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By FlashMessage = By.className("subheader");
    public SecureAreaPage(WebDriver driver) {

        this.driver=driver;

    }

    public String getFlashMessage(){

        String ConfirmationMessage = driver.findElement(FlashMessage).getText();
        return ConfirmationMessage;
    }
}
