package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']")); // locate the element
        textBox.clear(); // to clear the keys in the text
        textBox.sendKeys("Happy Day!!!!"); // then you can send keys after clearing the text box

        // Finding and inspecting RADIO BUTTONS

        WebElement option1=driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        Boolean stateOfOption1=option1.isSelected(); // to check if selected

        if (!stateOfOption1){ // this condition is not equal to option.isSelected
            option1.click(); // then click it
        }

        // print out the current state of option1 in the console
        System.out.println("The State of radio button 1 is "+option1.isSelected());

        // to check if the option 2 is enabled or not

        WebElement option2=driver.findElement(By.xpath("//input[@value='option2']"));
        Boolean enableStateOfOption2=option2.isEnabled();

        if (enableStateOfOption2){
            System.out.println("Option 2 is enable and can be selected");
        }
        else {
            System.out.println("Option 2 is not enabled and clickable");
        }

        // check if the option 3 is displayed or not and print in the console

        WebElement toggle=driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        toggle.click(); // click the toggle visibility to display option 3 and if not clicked console will show not displayed!!!

        // now find the html code associated with the option3 button in the DOM

        WebElement option3=driver.findElement(By.xpath("//input[@value='option3']"));
        Boolean displayStateOfOption3=option3.isDisplayed();

        if (displayStateOfOption3){
            System.out.println("The Radio button option 3 is displayed");
        }else {
            System.out.println("The Radio button option 3 is NOT displayed");
        }

        // get text which will be printed in the console

        WebElement text=driver.findElement(By.xpath("//div[@id='textElement']"));
        String text1=text.getText();
        System.out.println(text1);

        // get Attribute

        WebElement attribute =driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));
        String value=attribute.getAttribute("data-custom-attribute"); // or you can get the attribute value of "id"
        System.out.println(value);

    }
}
