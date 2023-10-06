package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageobjects.BaseMain;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;
import pageobjects.MFSignUpPage;

import java.time.Duration;


public class MyForkTest extends MFBaseTest {

    @Test
    public void openWebsite() throws InterruptedException{
       MFHomePage.openWebsite();

    }

    @Test
    public void signInPage() throws InterruptedException {
        MFHomePage.tabOpener();
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
        MFHomePage.tabOpener();
    }

    @Test
    public void pixelsOption() throws InterruptedException{
        MFHomePage.pixelsOption();
}

}

