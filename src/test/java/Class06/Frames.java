package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        // switch the focus to the frame 0
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("This is a frame");

        // switch to default content (main page)
        driver.switchTo().defaultContent();
        // switch to the frame with dropdown
        //driver.switchTo().frame(1); // ----> by Index
        // find by Id
        driver.switchTo().frame("dropdownIframe");
        WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByValue("avatar");

        //select the checkbox
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        //driver.switchTo().frame(0);
        // by WebElement
        WebElement frameNested=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frameNested);
        WebElement option =driver.findElement(By.xpath("//input[@value='Option-1']"));
        option.click();







    }
}
