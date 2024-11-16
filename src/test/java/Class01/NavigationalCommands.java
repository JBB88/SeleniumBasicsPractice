package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // initiate the instance of WebDriver
          //WebDriver driver = new SafariDriver();
        driver.manage().window().maximize(); // maximize the window

        driver.get("https://www.google.com"); // go to google

        driver.navigate().to("https://www.fb.com/"); // to facebook

        driver.navigate().back(); // to go back to google

        Thread.sleep(2000);

        driver.navigate().forward(); // to go back to fb again

        Thread.sleep(2000);

        driver.navigate().refresh(); // to refresh the page

        driver.close();

    }
}
