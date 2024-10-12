package Tests;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends TestBase{

    LoginPage loginPage ;
    SecureAreaPage secureAreaPage ;

    @BeforeClass
    public void preconditions()
    {
        loginPage = new LoginPage(driver);
        secureAreaPage = new SecureAreaPage(driver);
    }

    @Test(priority = 1)
    public void validateLoginWithValidCredentials()
    {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        loginPage.login("tomsmith" , "SuperSecretPassword!");
        secureAreaPage.validateSuccessfulLogin();
    }

    @Test(priority = 2)
    public void validateLoginWithInvalidUsername()
    {
        // TC_02 Login using invalid username and valid password
        // 1. Navigate to login page
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        // 2. Locate username and enter username
        loginPage.username().sendKeys("invalid");
        // 3. Locate password and enter password
        loginPage.password().sendKeys("SuperSecretPassword!");
        // 4. Locate login button and click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 3)
    public void validateLoginWithInvalidPassword()
    {
        // TC_03 Login using valid username and invalid password
        // 1. Navigate to login page
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        // 2. Locate username and enter username
        loginPage.username().sendKeys("tomsmith");
        // 3. Locate password and enter password
        loginPage.password().sendKeys("invalid!");
        // 4. Locate login button and click login button
        loginPage.loginBtn().click();
    }


}
