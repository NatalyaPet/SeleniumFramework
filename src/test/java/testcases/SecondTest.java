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
        //span[text()='Account']
        driver.findElement(By.xpath("//*[@id='log-in-button']")).click();

    }
    @Test
    public void validateEmailPasswordFields() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).click();
        System.out.println(driver.findElement(By.id("email")).isSelected());
        System.out.println(driver.findElement(By.id("password")).isSelected());

    }

    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        //span[text()='Account']
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@ua.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).submit();
    }

    @Test
    public void fillEmailAndPasswordFieldsEndPressEnter() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");
        //span[text()='Account']
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).click();
        //input[@type='email']
        //input[@type='password']
        driver.findElement(By.xpath("//input[@type='email']")). sendKeys("email@ua.com");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys("password");
        driver.findElement(By.xpath("//input[@type='password']")). sendKeys(Keys.ENTER);
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Herro\\IdeaProjects\\Testproject\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).click();
        System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());

    }
}
