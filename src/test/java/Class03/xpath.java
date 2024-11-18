package Class03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        WebElement userName=driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("JohnB26");

        //WebElement clickBtn=driver.findElement(By.xpath("//button[@id='DisplayName']"));
        //clickBtn.click();

        WebElement clickBtn=driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickBtn.click();

        WebElement securityQuestion = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityQuestion.sendKeys("What is my first job?");

        WebElement textMsg = driver.findElement(By.xpath("//label[contains(text(),' Lorem ipsum')]"));
        String text=textMsg.getText();
        System.out.println(text);

        WebElement apiSetting =driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSetting.sendKeys("This is the API Settings");

        WebElement email=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("myemail@ghey.com");

       WebElement field2 =driver.findElement(By.xpath("//input[@data-detail='two'and @name='customField']"));
       field2.sendKeys("You selected Field 2");

       WebElement field1 =driver.findElement(By.xpath("//input[@name ='customField1' and @data-detail='one']"));
       field1.sendKeys("I selected Field1 this time!");
        //Thread.sleep(2000);



    }
}
