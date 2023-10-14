package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.BaseMain;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;
import pageobjects.MFSignUpPage;

import java.time.Duration;



public class MyForkTest extends MFBaseTest {

    public String emailCredentials = "email@ua.com"; // pass String
    public String passwordCredentials = "1234567"; // pass int
    public String errorMsg = "//div[@class='test-login-errors']"; //pass String
    public String rememberMe = "//input[@id='auth-page-remember-me']"; //tru/false boolean
    public String textErrorMessage = "//p[contains(text(),'Error: email is incorrect')]";
    public String signupBtn = "//div[@id='sign-up-button']";
    public String jobTitle = "//select[@id='job-title']";
    public String errorText = "Error: email is incorrect";

    @Test
    public void openWebsite() throws InterruptedException{
       MFHomePage.openWebsite();
    }

    @Test
    public void signInPage() throws InterruptedException {
        MFHomePage.tabOpener(0);
        MFHomePage.signInPage();
    }

    @Test
    public void validateEmailPasswordLogin() throws InterruptedException {
        MFHomePage.signInPage();
        MFLoginPage.validateEmailPasswordLogin();
    }

   @Test
   public void fillEmailAndPasswordPressEnterAndValidateError() throws InterruptedException {
        MFHomePage.signInPage();
        MFLoginPage.fillEmailAndPasswordPressEnterAndValidateError();
        WebDriverWait waitForErrorToLoad = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitForErrorToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MFLoginPage.errorMsg)));
        MFLoginPage.showError();
    }

    @Test
    public void ValidateCheckbox() throws InterruptedException {
        MFHomePage.signInPage();
        MFLoginPage.validateCheckbox();
    }

    @Test
    public void SignupAndValidateOptions() throws InterruptedException {
        MFSignUpPage.signUpPage();
        MFSignUpPage.dropDown();
    }

    @Test
    public void tabOpener() throws InterruptedException {
        MFHomePage.tabOpener(0);
    }

    @Test
    public void pixelsOption() throws InterruptedException{
        MFHomePage.pixelsOption(2000);
    }

    @Test
    public void hardAssertions() throws InterruptedException{

        boolean rememberMe = true;
        int passwordCredentials = 7;
        MFHomePage.signInPage();
        Thread.sleep(2000);
        MFLoginPage.fillingCredentials(MFLoginPage.emailCredentials, MFLoginPage.passwordCredentials);
        MFLoginPage.validateCheckbox();
        MFLoginPage.errorText();

        Assert.assertEquals(emailCredentials,"email@ua.com"); //String/true
        Assert.assertEquals(passwordCredentials,7); //int/true
        System.out.println(passwordCredentials);
        Assert.assertEquals(errorText,"Error: email is incorrect"); //String/true
        System.out.println(errorText);
        Assert.assertFalse(rememberMe,"False"); // boolean

    }

@Test
    public void assertSoft() throws InterruptedException{

        SoftAssert softAssert = new SoftAssert();
    boolean signupBtn = true;
    int options = 14;

    MFSignUpPage.signUpPage();
    MFSignUpPage.dropDown();

    softAssert.assertFalse(signupBtn,"false"); //boolean/false
    System.out.println(signupBtn);
    softAssert.assertEquals(options,10); //int/false
    System.out.println(options);
    softAssert.assertEquals(jobTitle,"jobTitle"); //String/false
    System.out.println(jobTitle);
    softAssert.assertEquals(options,14); //int/true
    System.out.println(options);

softAssert.assertAll();
}

}

