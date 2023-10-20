package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BestBuyTest extends BBBaseTest {

    public String checkBox = "//label[@for='cia-remember-me']";
    public String emailLog = "email@ua.com";
    public String passLog = "password";


    @Test
    public void openSignInPage() throws InterruptedException {
        Thread.sleep(4000);
        BBHomePage.openSignInPage();
}

   // @Test
    public void fillEmailAndPasswordFieldsEndPressEnter() throws InterruptedException {
        Thread.sleep(3000);
        BBHomePage.openSignInPage();
        Thread.sleep(3000);
        BBLoginPage.fillCredentials(BBLoginPage.emailLog, BBLoginPage.passLog);
        Thread.sleep(2000);
        BBLoginPage.submitCredentials();
    }

    //@Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        Thread.sleep(3000);
        BBLoginPage.fillEmailAndPasswordFieldsEndPressEnter();
        BBLoginPage.displayError();
    }

    //@Test
    public void verifyCheckbox() throws InterruptedException {
       Thread.sleep(3000);
       BBHomePage.openSignInPage();
       System.out.println(driver.findElement(By.xpath(checkBox)).isSelected());
    }
//@Test
public void displayError() throws InterruptedException{

        BBHomePage.openSignInPage();
        BBLoginPage.fillEmailAndPasswordFieldsEndPressEnter();
        Thread.sleep(3000);
        BBLoginPage.displayError();

    }

   // @Test
    public void isEnabled() throws InterruptedException {

      driver.get("https://secure.bankofamerica.com/secure-mycommunications/public/appointments/?marketingCode=NEWHP_ECHMPG");

      driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
      Thread.sleep(2000);
      System.out.println(driver.findElement(By.xpath("//button[text()= 'Cancel' and @href= 'javascript:void'(0)]")));
      System.out.println(driver.findElement(By.xpath("//button[@id= 'nextBtnSubTopic']")).isEnabled());
    }


}







