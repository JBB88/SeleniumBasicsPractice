package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AcMMx-cIFdDR7UuXt7nzuxBGW7P3_kZa_-L4tCgFgNO3qfQJTIQQBjdymd3esXXT5Kk3r1XQQot1&ddm=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        // click the button help and privacy
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the main page and save it in a variable

        String mainPageHandle = driver.getWindowHandle(); // ---> to reuse it
        System.out.println(mainPageHandle); // this will return alphanumeric

        // switch the focus of the driver to the window privacy
        // get the handles
        Set<String> allHandles = driver.getWindowHandles(); // will return a set
        // iterate
        for (String handle:allHandles){
        // switch to the handle
            driver.switchTo().window(handle);
        // check if this is the desired window
            if(driver.getTitle().equals("Privacy Policy – Privacy & Terms – Google")){ // get the title in the DOM by //title
                break;
            }
        }

        // confirming that we are on privacy
        System.out.println(driver.getCurrentUrl());
        driver.close();
        // switch the focus to the main page
        driver.switchTo().window(mainPageHandle);
        // confirming that we are on main page
        System.out.println(driver.getCurrentUrl());
        //driver.close();


    }
}
