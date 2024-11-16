package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // initiating the instance of chrome driver

        driver.manage().window().maximize(); // to maximize the screen

        driver.get("https://www.google.com"); // go to the url

        String title= driver.getTitle(); // get the title and print in the console
        System.out.println(" The title of the page is "+title);

        String url=driver.getCurrentUrl(); // get the url of the page and print in the console
        System.out.println("The url is "+url);

        Thread.sleep(4000); // slow down code but not advisable to use

        driver.quit(); // to close the window
    }
}
