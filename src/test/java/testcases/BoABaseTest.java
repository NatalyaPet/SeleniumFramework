package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.BoAHomePage;

public class BoABaseTest {
    public static ChromeDriver driver;

    BoAHomePage  BoAHomePage;


    @BeforeMethod(groups = {"first", "second", "third" }, alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        BoAHomePage = new BoAHomePage(driver);


    }
        @AfterMethod(groups = {"first", "second", "third" }, alwaysRun = true)
        public void tearDown() {
            driver.quit();
        }

            }






