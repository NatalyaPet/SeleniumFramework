package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;

public class MFBaseTest {

    public ChromeDriver driver;
    MFHomePage MFHomePage;
    MFLoginPage MFLoginPage;


@BeforeMethod

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver2.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        MFHomePage = new pageobjects.MFHomePage(driver);
        MFLoginPage = new pageobjects.MFLoginPage(driver);


}

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}