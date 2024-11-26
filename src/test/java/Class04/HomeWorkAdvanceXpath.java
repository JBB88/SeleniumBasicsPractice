package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkAdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        //01: Enter the name of your favorite books in reverse order
        // from least favorite.

        WebElement nameOfBook1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        nameOfBook1.sendKeys("Naruto");

        WebElement nameOfBook2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        nameOfBook2.sendKeys("Captain Underpants");

        WebElement nameOfBook3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        nameOfBook3.sendKeys("Dog Man");

        //02: Enter the name of your favorite book, then the second and third best:

        WebElement favBook1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favBook1.sendKeys("Dog Man");

       WebElement favBook2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
       favBook2.sendKeys("Captain Underpants");

        WebElement favBook3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favBook3.sendKeys("Naruto");

        //03: Enter the names in order: grandparent, then parent and finally child

        WebElement name1=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        name1.sendKeys("grandparent");

        WebElement name2=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        name2.sendKeys("parent");

        WebElement name3=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        name3.sendKeys("child");

    }
}
