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
    HomePage homePage;
    LoginPage loginPage;
    SignUpPage signUpPage;
    GalleryPage galleryPage;
    QuizPage quizPage;
    ProgressPage progressPage;


    @BeforeMethod//(groups = {"first", "second", "third"}, alwaysRun = true)


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        galleryPage = new GalleryPage(driver);
        quizPage = new QuizPage(driver);
        progressPage = new ProgressPage(driver);
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //driver.executeScript("window.scrollBy(0,2000)");

    }

     @AfterMethod//(groups = {"first", "second", "third" }, alwaysRun = true)

    public void tearDown() {
        driver.quit();
    }
}
