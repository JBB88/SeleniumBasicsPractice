package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardkeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/keypress.php");

        //find the input box

        WebElement inputBox=driver.findElement(By.xpath("//input[@class='form-control']"));

        // send the key Enter from the keyboard

        inputBox.sendKeys(Keys.ENTER); // ---> using Keys Class in selenium

        //inputBox.clear();

        Thread.sleep(2000); // ---> just to observe the change

        inputBox.sendKeys(Keys.BACK_SPACE);

    }
}
