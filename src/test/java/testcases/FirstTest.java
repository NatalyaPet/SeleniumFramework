package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void startDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("");
    }

    @Test
    public void openWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");
    }

    @Test
    public void openSignInPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        //span[text()='Account']
        driver.findElement(By.xpath("//button[@aria-expanded= 'false' and @id= 'account-menu-account-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
    }


    @Test
    public void validateEmailPasswordFields() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        //span[text()='Account']
        driver.findElement(By.xpath("//button[@aria-expanded= 'false' and @id= 'account-menu-account-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        //input[@type='email']
        //input[@type='password']
        driver.findElement(By.xpath("//input[@type='email']"));
        driver.findElement(By.xpath("//input[@type='password']"));
        driver.findElement(By.xpath("//button[text()='Sign In']"));
        System.out.println(driver.findElement(By.xpath("//input[@type='email']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//button[text()='Sign In']")).isDisplayed());
    }

    @Test
    public void fillEmailAndPasswordFieldsEndPressEnter() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        //span[text()='Account']
        driver.findElement(By.xpath("//button[@aria-expanded= 'false' and @id= 'account-menu-account-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        //input[@type='email']
        //input[@type='password']
        driver.findElement(By.xpath("//input[@type='email']")). sendKeys("email@ua.com");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys(Keys.ENTER);
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        //span[text()='Account']
        driver.findElement(By.xpath("//button[@aria-expanded= 'false' and @id= 'account-menu-account-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        driver.findElement(By.xpath("//input[@type='email']")). sendKeys("email@ua.com");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@aria-label='Error']")).isDisplayed());

    }


    @Test
    public void verifyCheckboxCheckedByDefault() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//button[@aria-expanded= 'false' and @id= 'account-menu-account-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).isSelected());

    }

    }







