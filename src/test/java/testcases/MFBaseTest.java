package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;
import pageobjects.MFSignUpPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MFBaseTest {

    public static ChromeDriver driver;
    MFHomePage MFHomePage;
    MFLoginPage MFLoginPage;
    MFSignUpPage MFSignUpPage;


    @BeforeMethod

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        MFHomePage = new pageobjects.MFHomePage(driver);
        MFLoginPage = new pageobjects.MFLoginPage(driver);
        MFSignUpPage = new pageobjects.MFSignUpPage(driver);
        SoftAssert softAssert = new SoftAssert();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //driver.executeScript("window.scrollBy(0,2000)");

    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}