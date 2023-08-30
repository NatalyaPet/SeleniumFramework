package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

    public ChromeDriver driver;
    public String bestBuyURL = "http://bestbuy.com";
    private String account_btn = "//span[text()='Account']";
    private String signIn_btn = "//a[@data-lid='ubr_mby_signin_b']";
    private String fillingEmail = "//input[@type='email']";
    private String emailLog = "email@ua.com";
    private String fillingPassword = "//input[@type='password']";
    private String passLog = "password";
    private String logIn_btn = "//button[text()= 'Sign In']";
    private String errorMsg = "//div[@aria-label='Error']";
    private String checkBox = "//label[@for='cia-remember-me']";


@BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    public void openSignInPage() throws InterruptedException {

        driver.get(bestBuyURL);
        driver.findElement(By.xpath(account_btn)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(signIn_btn)).click();
    }

    @Test
    public void fillEmailAndPasswordFieldsEndPressEnter() throws InterruptedException {

        openSignInPage();

        Thread.sleep(2000);
        driver.findElement(By.xpath(fillingEmail)).sendKeys(emailLog);
        driver.findElement(By.xpath(fillingPassword)).sendKeys(passLog);
        driver.findElement(By.xpath(logIn_btn)).submit();
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        openSignInPage();

        Thread.sleep(2000);
        driver.findElement(By.xpath(fillingEmail)). sendKeys(emailLog);
        driver.findElement(By.xpath(fillingPassword)). sendKeys(passLog);
        driver.findElement(By.xpath(logIn_btn)). sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(errorMsg)).isDisplayed());
    }

    @Test
    public void verifyCheckboxCheckedByDefault() throws InterruptedException {

       openSignInPage();

       System.out.println(driver.findElement(By.xpath(checkBox)).isSelected());
    }

    @Test
    public void isEnabled() throws InterruptedException {

      driver.get("https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG");

      driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
      Thread.sleep(2000);
      System.out.println(driver.findElement(By.xpath("//button[text()= 'Cancel' and @href= 'javascript:void'(0)]")));
      System.out.println(driver.findElement(By.xpath("//button[@id= 'nextBtnSubTopic']")).isEnabled());
    }

@AfterMethod
    public void tearDown() {
      driver.quit();
    }

}







