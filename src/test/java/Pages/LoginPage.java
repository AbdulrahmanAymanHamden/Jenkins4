package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    // WebDriver
    WebDriver driver ;

    public LoginPage(WebDriver d)
    {
        driver = d;
    }

    // Username
    public WebElement username()
    {
        return driver.findElement(By.id("username"));
    }

    public void enterUsername(String username)
    {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public WebElement password()
    {
        return driver.findElement(By.id("password"));
    }

    public void enterPassword(String password)
    {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public WebElement loginBtn()
    {
        return driver.findElement(By.className("radius"));
    }

    public void clickOnLoginButton()
    {
        driver.findElement(By.className("radius")).click();
    }

    public void login(String username , String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
    }


}
