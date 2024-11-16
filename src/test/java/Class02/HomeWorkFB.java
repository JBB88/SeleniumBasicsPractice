package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkFB {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

         WebElement name =driver.findElement(By.linkText("Create new account"));
         name.click();

         Thread.sleep(4000);

         WebElement fName=driver.findElement(By.name("firstname"));
         fName.sendKeys("John");

        WebElement lName=driver.findElement(By.name("lastname"));
        lName.sendKeys("Doe");

        WebElement email =driver.findElement(By.name("reg_email__"));
        email.sendKeys("jdoe@ggmail.com");

        //WebElement eMailOrNumber = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
        //eMailOrNumber.sendKeys("123-456-789");

        WebElement passWord =driver.findElement(By.id("password_step_input"));
        passWord.sendKeys("hohoho!!!%%%");

        Thread.sleep(4000);

        //WebElement haveAccount =driver.findElement(By.linkText("Already have an account?"));
        //haveAccount.click();



    }
}
