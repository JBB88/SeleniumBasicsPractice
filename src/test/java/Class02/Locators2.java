package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.sql.Driver;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");

        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester");

        WebElement pass=driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");

        WebElement loginBtn =driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement message=driver.findElement(By.className("login_info")); // to print the text in the console
        String text=message.getText();
        System.out.println(text);

        String title=driver.getTitle(); // to get the title
        System.out.println(title);

        if(title.equals("Web Orders")){   // using if else to verify if you are logged in
            System.out.println("You are logged in");
        }
        else {
            System.out.println("You are not logged in");
        }

        driver.close();
    }
}
