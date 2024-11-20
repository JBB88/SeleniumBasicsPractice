package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath-homework.php");

        WebElement hobby=driver.findElement(By.xpath("//input[@id ='yourHobbiesId']"));
        hobby.sendKeys("Reading, Playing Chess, Reading Books");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click Here']"));
        btn.click();

        //WebElement btn2 = driver.findElement(By.tagName("button")); // other way to find WebElement using tagName
        //btn2.click();

        WebElement favMovies=driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        favMovies.sendKeys("Passion of Christ");

        WebElement paragraph = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor')]"));
        String text = paragraph.getText();
        System.out.println(text);

        WebElement city = driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("Clayton");

        WebElement personalEmail=driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        personalEmail.sendKeys("personal@abc.com");

        WebElement officeEmail=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        officeEmail.sendKeys("office@abc.com");

        WebElement professionalEmail=driver.findElement(By.xpath("(//input[@type='email'])[3]"));
       professionalEmail.sendKeys("professional@abc.com");

       WebElement clientName =driver.findElement(By.xpath("//input[@name='clientName' and @class='form-control']"));
       clientName.sendKeys("John Doe");

       WebElement clientId=driver.findElement(By.xpath("//input[@id='clientId' and @class='form-control']"));
       clientId.sendKeys("123345797");

       WebElement streetNum=driver.findElement(By.xpath("//input[@name='StreetNo']"));
       streetNum.sendKeys("888");

      WebElement houseNum= driver.findElement(By.xpath("//input[@name='HouseNo']"));
      houseNum.sendKeys("777");

      Thread.sleep(2000);

        driver.close();



    }
}
