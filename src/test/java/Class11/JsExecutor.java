package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        // to draw a boundary around the WebElement

        WebElement hoverButton =driver.findElement(By.xpath("//button[text()='Hover me!']"));

        // using javascript executor

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //note --> you can change the arguments like 3px solid red !!!!
        //js.executeScript("arguments[0].style.border='5px solid orange'",hoverButton); // provide the location
        js.executeScript("arguments[0].style.backgroundColor='yellow'; arguments[0].style.border='5px solid orange'",hoverButton);

        // scrolling up and down

        js.executeScript("window.scrollBy(0,1000)"); // scroll down

        Thread.sleep(2000); // --- just to observe

        js.executeScript("window.scrollBy(0,-1000)"); // scroll up

        //js.executeScript("arguments[0].scrollIntoView(true);", element); // to scroll to a particular element

        Thread.sleep(2000); // --- just to observe

        // get the click button using js executor!!!
        //WebElement clickBtn =driver.findElement(By.xpath("//button[text()='Right Click!']"));
        WebElement clickButton = driver.findElement(By.xpath("//a[text()='File Upload']"));
        //js.executeScript("arguments[0].click();",clickBtn);
        js.executeScript("arguments[0].click();",clickButton);

        // Taking Screen shot

        TakesScreenshot ss =(TakesScreenshot) driver; // casting the driver

        File screenShot =ss.getScreenshotAs(OutputType.FILE); // taking the screenshot

        FileUtils.copyFile(screenShot,new File("screenshot/image3.png")); // save it in your PC and store it in a particular folder "screenshot"





    }
}
