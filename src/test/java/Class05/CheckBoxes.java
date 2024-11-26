package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //Single Checkbox Demo

        WebElement checkBox1=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();

        //Multiple Checkbox Demo

        List<WebElement> options=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement option:options){
            String optionValue=option.getAttribute("value");
            if (optionValue.equals("Option-3") || optionValue.equals("Option-1")){ // make this option and remove break
                option.click();
                //break;
            }

        }

        //Disabled Checkbox Demo
        WebElement enableBtn=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableBtn.click();

        List<WebElement>buttons=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement option1:buttons){
            String optionBtns=option1.getAttribute("value");
            if (optionBtns.equals("Checkbox-3")){
                option1.click();
                break;
            }

        }

    }
}
