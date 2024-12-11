package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        TakesScreenshot ss =(TakesScreenshot) driver; // casting the driver

        File screenShot =ss.getScreenshotAs(OutputType.FILE); // taking the screenshot

        FileUtils.copyFile(screenShot,new File("screenshot/image2.png")); // save it in your PC and store it in a particular folder "screenshot"

        // taking another screenshot? ----> change the name of the file image2.png !!!


    }
}
