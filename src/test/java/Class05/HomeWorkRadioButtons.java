package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkRadioButtons {    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        // Choose your favorite Beverages
        List<WebElement> radioBtn= driver.findElements(By.xpath("//input[@name='beverage']"));
        for (WebElement radio:radioBtn){
            String option=radio.getAttribute("value");
            if(option.equals("Coffee")){
                radio.click();
                break;
            }
        }

        // Preferred Working Environment

        List<WebElement>buttons=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement radio1:buttons){
            String radioBtn1=radio1.getAttribute("value");
            if(radioBtn1.equals("home")){
                radio1.click();
                break;
            }
        }
    }
}
