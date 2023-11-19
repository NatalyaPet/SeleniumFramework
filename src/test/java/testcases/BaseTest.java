package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pageobjects.*;

import java.time.Duration;

public class BaseTest {

    public static ChromeDriver driver;
    MFHomePage mfHomePage;
    MFLoginPage mfLoginPage;
    MFSignUpPage mfSignUpPage;
    MFGalleryPage mfGalleryPage;
    MFQuizPage mfQuizPage;
    MFProgressPage mfProgressPage;


    @BeforeMethod(groups = {"first", "second", "third" }, alwaysRun = true)


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        mfHomePage = new pageobjects.MFHomePage(driver);
        mfLoginPage = new pageobjects.MFLoginPage(driver);
        mfSignUpPage = new pageobjects.MFSignUpPage(driver);
        mfGalleryPage = new MFGalleryPage(driver);
        mfQuizPage = new MFQuizPage(driver);
        mfProgressPage = new MFProgressPage(driver);
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //driver.executeScript("window.scrollBy(0,2000)");

    }

   // @AfterMethod(groups = {"first", "second", "third" }, alwaysRun = true)

   // public void tearDown() {
    //   driver.quit();
    }
