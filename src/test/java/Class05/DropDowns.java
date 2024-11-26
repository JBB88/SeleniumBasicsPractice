package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // find the dropdown

        WebElement dd =driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use the select class

        Select select = new Select(dd);

        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("Wednesday");
        Thread.sleep(2000);
        select.selectByVisibleText("Saturday");

        // Multi Select DropDown

       WebElement dropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));

       Select sel = new Select(dropDown);

       // to check if it is multi select

        System.out.println("The DD is multi select? "+ sel.isMultiple());

        sel.selectByValue("New York");

        sel.selectByVisibleText("Pennsylvania");
        Thread.sleep(2000);
        sel.deselectByValue("New York");


    }
}
