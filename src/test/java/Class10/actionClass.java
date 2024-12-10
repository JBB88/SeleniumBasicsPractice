package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        // hover
        WebElement hover  =driver.findElement(By.xpath("//button[text()='Hover me!']"));

        // declare action class only once!!!
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform(); // do not forget ----> . perform()

        Thread.sleep(2000); // ---> to observe

        // right click
        WebElement rightClick=driver.findElement(By.xpath("//button[@id='show_context_menu']"));
        action.contextClick(rightClick).perform();

        // droppable or drag and drop action

        // draggable
        WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
        // dropLocation
        WebElement dropLoc= driver.findElement(By.id("droppable"));

        //action.dragAndDrop(dragable,dropLoc).perform();

        // method chaining, we use build at the end
        action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();



    }
}
