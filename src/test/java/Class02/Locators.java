package Class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

       WebElement email = driver.findElement(By.id("email"));
       email.sendKeys("abababa@gmail.com");

      WebElement name= driver.findElement(By.name("pass"));
      name.sendKeys("MyPassKey");

      WebElement login=driver.findElement(By.name("login"));
      //login.click();

        //WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        //createAccount.click();

        WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
        createAccount.click();

    }
}
