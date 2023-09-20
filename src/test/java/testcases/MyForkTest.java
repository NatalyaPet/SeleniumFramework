package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;


public class MyForkTest extends MFBaseTest {

    @Test
    public void openWebsite() throws InterruptedException{
       MFHomePage.openWebsite();
    }

    @Test
    public void signInPage() throws InterruptedException {
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
       Thread.sleep(3000);
      // MFLoginPage.fillingCredentials(MFLoginPage.emailCredentials, MFLoginPage.passwordCredentials);
       MFLoginPage.fillEmailAndPasswordPressEnterAndValidateError();
       Thread.sleep(2000);
       MFLoginPage.showError();
    }

    @Test
    public void ValidateCheckbox() throws InterruptedException {
        MFHomePage.signInPage();
        MFLoginPage.validateCheckbox();

    }

}
