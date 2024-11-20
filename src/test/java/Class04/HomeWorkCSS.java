package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkCSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("User ID");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("User Name");

        WebElement inputBox=driver.findElement(By.cssSelector("input[name*='LectureIntro'"));
        inputBox.sendKeys("This is the Introduction to the Lecture in Selenium.");

        WebElement feedBox1=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedBox1.sendKeys("This is the feed back from Ray.");

        WebElement feedBox2=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBox2.sendKeys("This is the feed back from Ducky!");

        WebElement clientId=driver.findElement(By.cssSelector("input[data-ends^='CSS']"));
        clientId.sendKeys("4964648");

        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("abc@gnail.com");

        WebElement courseTopic=driver.findElement(By.cssSelector("input[name$='Topic']"));
        courseTopic.sendKeys("Selenium by Moazzam!");




    }
}
