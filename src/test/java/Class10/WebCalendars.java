package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCalendars {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        // click on the box for calendar to appear

        WebElement calendar=driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calendar.click();


        // select from calendar
        boolean notFound = true; // --> set a condition
        while(notFound){
            // get current month
            String currentMonth= driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
        if(currentMonth.equals("December 2024")){
            notFound=false; // set a condition
            // select the date

        }
        if(notFound){
            // click on next button
            WebElement nextButton=driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
            nextButton.click();
        }

    }

        // select the date
        List<WebElement> allDates =driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));

        // iterate
        for (WebElement date:allDates){
            if (date.getText().equals("10")){
                date.click();
                break;
            }
        }

    }
}
