package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        // following Sibling:

        WebElement favBook1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        favBook1.sendKeys("Harry Potter");

        WebElement favBook2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        favBook2.sendKeys("Peter Pan");

        WebElement favBook3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        favBook3.sendKeys("Cinderella");

        // preceding Sibling ( in reverse order)

        WebElement leastFavBook1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavBook1.sendKeys("Cinderella");

        WebElement leastFavBook2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavBook2.sendKeys("Peter Pan");

        WebElement leastFavBook3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavBook3.sendKeys("Harry Potter");

        //Parent Child Relationship

        WebElement grandParent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("grandparent");

        WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("parent");

        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child");

        Thread.sleep(4000);

        driver.close();
    }
}
