package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        // click on the radio button male
        // check if it is selected or not and print the status of selection in the console
        // find the check box

        WebElement radioButtonMale=driver.findElement(By.xpath("//input[@value='Male' and @name ='optradio']"));
        radioButtonMale.click(); // click on it

        if (radioButtonMale.isSelected()){
            System.out.println("Male Radio Button has been clicked!");
        }else {
            System.out.println("Male Radio Button has not been clicked!");
        }

        // Enable the button then click it

        WebElement enableBtn=driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableBtn.click();

        WebElement radioBtnFemale =driver.findElement(By.xpath("//input[@value='gender-female']"));
        radioBtnFemale.click();

        //

        List<WebElement>radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']")); // get all the radio buttons
        for (WebElement radio:radioBtns) {  // use loop to iterate the buttons
           String option=radio.getAttribute("value"); // 5 - 15
           if (option.equals("5 - 15")){ // true
               radio.click();
               break; // to exit the for loop
           }

        }

    }
}
