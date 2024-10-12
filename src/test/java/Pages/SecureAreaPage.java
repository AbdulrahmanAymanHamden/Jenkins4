package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage {

    // Web Driver
    WebDriver driver ;

    // Constructor

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }


    // Methods


    public void validateSuccessfulLogin()
    {
        Assert.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
        Assert.assertEquals( driver.getCurrentUrl() , "https://the-internet.herokuapp.com/secure" );
    }
}
