package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.BBHomePage;
import pageobjects.BBLoginPage;

public class BBBaseTest {
        public ChromeDriver driver;

        BBHomePage BBHomePage;
        BBLoginPage BBLoginPage;

        @BeforeMethod(groups = {"first","second"}, alwaysRun = true)
        public void setUp(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            BBHomePage = new BBHomePage(driver);
            BBLoginPage = new BBLoginPage(driver);
        }

      @AfterMethod(groups = {"first","second"}, alwaysRun = true)
        public void tearDown() {
            if(driver!= null){
                driver.quit();
            }
        }

    }



