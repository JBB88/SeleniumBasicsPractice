package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement checkBox=driver.findElement(By.xpath("//input[@id='newsletter']"));
        checkBox.click();

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for(WebElement option:checkBoxes){
            String optionId =option.getAttribute("id");
            if(optionId.equals("traveling") || optionId.equals("gardening")) {
                option.click();
                //break;
            }

        }
    }
}
