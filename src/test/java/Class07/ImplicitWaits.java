package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        // place the implicit wait right after the getting the url because they are global waits
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // HOW WAITS WORKS
        // SYNTAX IMPLICIT WAIT
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //TASK
        // CLICK ON THE FIRST BUTTON AND GET THE TEXT OUT OF IT AND DISPLAY IN THE CONSOLE

        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();


        WebElement text1 =driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text1.getText());



    }
}
