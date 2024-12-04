package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {
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

//      get the columns with id
        List<WebElement> ids=driver.findElements(By.xpath("//table/tbody/tr/td[2]")); // td[2]

//      iterate to find the row number
        for (int i=0; i<ids.size();i++){

            String id=ids.get(i).getText();

            if (id.equals("52020B")){ // 110360A
//      print the row number
                System.out.println(i+1);
                WebElement checkBox=driver.findElement(By.xpath("//table/tbody/tr[" + (i+1) + "]/td[1]"));
                checkBox.click();
            }
        }

    }
}
