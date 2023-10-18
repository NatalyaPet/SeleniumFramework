package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
import java.util.List;


public class MyForkTest extends MFBaseTest {


    public String rememberMe = "//input[@id='auth-page-remember-me']"; //tru/false boolean
    public String signupBtn = "//div[@id='sign-up-button']";
    public String jobTitleText = "//label[contains(text(),'Job Title')]";
    public String errorText = "Error: email is incorrect";
    public String optionsList = "//select[@id='job-title']//option";
    public String loginOptions = "//body/div[@id='app']/div[1]/div[2]/form[1]//label";
    public String textForEmailTitle = "//label[contains(text(),'Email')]";

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



        MFHomePage.signInPage();

        String emailText = driver.findElement(By.xpath(textForEmailTitle)).getText();
        Thread.sleep(4000);
        int loginOptionsSize;
        List<WebElement> elementList = driver.findElements(By.xpath(loginOptions));
        loginOptionsSize = elementList.size();

        MFLoginPage.fillingCredentials(MFLoginPage.emailCredentials, MFLoginPage.passwordCredentials);
        MFLoginPage.validateCheckbox();
        MFLoginPage.errorText();
        boolean rememberMeChecked = driver.findElement(By.xpath(rememberMe)).isSelected();

        Assert.assertEquals(emailText,"Email"); //String/pass

        Assert.assertEquals(loginOptionsSize,3); //int/pass
        System.out.println(loginOptionsSize);

        Assert.assertEquals(errorText,"Error: email is incorrect"); //String/pass
        System.out.println(errorText);

        Assert.assertFalse(rememberMeChecked,"False"); // boolean/fail

    }

@Test
    public void assertSoft() throws InterruptedException{

        SoftAssert softAssert = new SoftAssert();

    MFHomePage.openWebsite();
    boolean signupBtnDisplayed = driver.findElement(By.xpath(signupBtn)).isDisplayed();
    MFSignUpPage.signUpPage();


    softAssert.assertEquals(signupBtnDisplayed,false); //boolean/fail
    System.out.println(signupBtnDisplayed);

    MFSignUpPage.dropDown();
    int optionsSize;
    List<WebElement> elementList = driver.findElements(By.xpath(optionsList));
    optionsSize = elementList.size();
    softAssert.assertEquals(optionsSize,10); //int/fail
    System.out.println(optionsSize);

    String actualTitle = driver.findElement(By.xpath(jobTitleText)).getText();
    softAssert.assertEquals(actualTitle,"Title"); //String/fail
    System.out.println(actualTitle);

    softAssert.assertEquals(optionsSize,14); //int/pass
    System.out.println(optionsSize);

softAssert.assertAll();
}

}

