package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        // get all the links and print them all in the console
        // iterate the WebElements using for loop / for each loop
        List<WebElement>allLinks=driver.findElements(By.tagName("a")); // use findElements!
        for (WebElement link:allLinks){

            String text=link.getText(); // to print the WebElements in the console
            System.out.println(text);

            String linkAddress=link.getAttribute("href"); // to extract and print all the links in the console
            System.out.println(linkAddress);

        }

    }
}
