package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseMain {

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";
    public String emailCredentials = "testing@my-fork.com"; // pass String
    public String passwordCredentials = "Password"; // pass int
    public String errorMsg = "//div[@class='test-login-errors']"; //pass String
    public String rememberMe = "//input[@id='auth-page-remember-me']"; //tru/false boolean

    public String signInBtn = "//button[contains(text(),'Log In')]";
    public String textErrorMessage = "//p[contains(text(),'Error: email is incorrect')]";
    public String errorText = "Error: email is incorrect";


    public void validateEmailPasswordLogin() throws InterruptedException {

        Thread.sleep(1000);

        System.out.println(driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(signInBtn)).isDisplayed());
    }

    public void fillingCredentials(String emailCredentials, String passwordCredentials) throws InterruptedException {
        driver.findElement(By.xpath(emailField)).sendKeys(emailCredentials);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordCredentials);
        driver.findElement(By.xpath(signInBtn)).sendKeys(Keys.ENTER);
    }
    public void fillEmailAndPasswordPressEnterAndValidateError() throws InterruptedException {
        driver.findElement(By.xpath(emailField)).sendKeys(emailCredentials);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordCredentials);
        driver.findElement(By.xpath(signInBtn)).sendKeys(Keys.ENTER);

    }

        public void showError () throws InterruptedException {
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath(errorMsg)).getText());
        }

        public void validateCheckbox () throws InterruptedException {
            System.out.println(driver.findElement(By.xpath(rememberMe)).isSelected());
            }


            public void errorText() throws InterruptedException{
            driver.findElement(By.xpath(textErrorMessage));

            }


}









