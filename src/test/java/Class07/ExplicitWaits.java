package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        //explicit wait syntax:
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // wait.until(ExpectedConditions.condition);

        // find the button element for the alert

        driver.findElement(By.xpath("//button[@id='show_alert']")).click();

        //explicit wait for alert to appear ( Declaration of wait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        // switch the focus after the alert appears
        driver.switchTo().alert().accept();

        // wait until the text is changed
        // wait until the text changes
        driver.findElement(By.xpath("//button[@id='changetext_button']")).click();
        WebElement textElement =driver.findElement(By.xpath("//h2[@id='headingtext']"));
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20)); ---> no need to declare it again
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        System.out.println(textElement.getText());

        // Display Button
        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']"))).click();
        WebElement enabledText=driver.findElement(By.xpath("//button[text()='Enabled']"));
        System.out.println(enabledText.getText());

    }
}
