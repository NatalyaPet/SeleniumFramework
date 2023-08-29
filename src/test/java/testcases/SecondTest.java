package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void startDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
    }

    @Test
    public void openWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
    }

    @Test
    public void openSignInPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']/div")).click();
    }

    @Test
    public void validateEmailPasswordLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']/div")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']"));
        driver.findElement(By.xpath("//input[@id='password']"));
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        System.out.println(driver.findElement(By.id("password")).isDisplayed());
        System.out.println(driver.findElement(By.id("loginButton")).isDisplayed());
    }

    @Test
    public void fillEmailAndPasswordPressEnterAndValidateError() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']/div")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@ua.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());
    }

    @Test
    public void ValidateCheckbox() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']/div")).click();
        System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());
    }
}
