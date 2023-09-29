package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MFLoginPage extends BaseMain {

    public MFLoginPage(ChromeDriver driver) {
        super(driver);
    }

    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";
    public String emailCredentials = "email@ua.com";
    public String passwordCredentials = "password";
    public String errorMsg = "//div[@class='test-login-errors']";
    public String rememberMe = "//input[@id='auth-page-remember-me']";

    public String signInBtn = "//button[contains(text(),'Log In')]";


    public void validateEmailPasswordLogin() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(signInBtn)).isDisplayed());
    }

    public void fillingCredentials(String emailCredentials, String passwordCredentials) throws InterruptedException {
        driver.findElement(By.xpath(emailField));
        driver.findElement(By.xpath(passwordField));
    }
    public void fillEmailAndPasswordPressEnterAndValidateError() throws InterruptedException {
        driver.findElement(By.xpath(emailField)).sendKeys(emailCredentials);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordCredentials);
        driver.findElement(By.xpath(signInBtn)).sendKeys(Keys.ENTER);

    }

        public void showError () throws InterruptedException {
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath(errorMsg)).isDisplayed());
        }

        public void validateCheckbox () {
            System.out.println(driver.findElement(By.xpath(rememberMe)).isSelected());
            }

            }







