package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement profileId = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("213213");

        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("Awesome");

        WebElement feedBox1 =driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedBox1.sendKeys("This is Jenny's feedback");

        WebElement feedBox2 =driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBox2.sendKeys("This is Raj's Feedback!");

        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium");

        WebElement intro = driver.findElement(By.cssSelector("input[name^=Intro]"));
        intro.sendKeys("This is the Introduction to Advance Class04.CSS");

        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("This is the conclusion of Class04.CSS Module!");

        Thread.sleep(2000);

        driver.close();

    }
}
