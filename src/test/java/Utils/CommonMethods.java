package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.webauthn.model.CredentialAdded;

import java.io.IOException;
import java.time.Duration;

import static Utils.ConfigReader.read;

public class CommonMethods {

public static WebDriver driver; // declaring the variable to access it throughout the class

        // Opening up an application
        public static void openBrowserAndLaunchApplication() throws IOException {

            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.get(read("url"));


        }

        public static void closeBrowser(){
            driver.quit();
        }
    }
