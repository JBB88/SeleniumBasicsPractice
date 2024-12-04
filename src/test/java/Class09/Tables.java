package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//      login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
//      Click PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // get column id

        // iterate to find the row number of the desired id


        boolean notFound = true;
        while (notFound) {
            int count = 0; // declare it inside the loop
            // get the id column to resolve stale element exception
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (WebElement id : ids) {

                if (id.getText().equals("111935A")) { // 42815824 ; 111935A
                    System.out.println("The Row number is " + (count + 1));
                    // click on the checkbox - locate the checkbox
                    String xpath = "//table/tbody/tr[" + (count + 1) + "]/td[1]";
                    WebElement checkBox = driver.findElement(By.xpath(xpath));
                    checkBox.click();
                    notFound = false;
                    // break; ---> will not work
                }

                count = count + 1;
                // note: always check the row if it is correct by inspecting the DOM, do not count!!!!
            }

            // click on the next page
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();

            }
        }
    }
}