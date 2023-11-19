package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.MFHomePage;
import pageobjects.MFLoginPage;

import java.time.Duration;
import java.util.List;


public class MyForkTest extends BaseTest {


    public String rememberMe = "//input[@id='auth-page-remember-me']";
    public String signupBtn = "//div[@id='sign-up-button']";
    public String jobTitleText = "//label[contains(text(),'Job Title')]";
    public String errorText = "Error: email is incorrect";
    public String optionsList = "//select[@id='job-title']//option";
    public String loginOptions = "//body/div[@id='app']/div[1]/div[2]/form[1]//label";
    public String textForEmailTitle = "//label[contains(text(),'Email')]";
    public String historyBttn = "//a[@class='quiz-section-history-button' and contains(text(),'History')]";

   // @Test
    public void openWebsite() throws InterruptedException{
       mfHomePage.openWebsite();
    }

  // @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        mfHomePage.tabOpener(0);
        mfHomePage.signInPage();

    }

   //@Test(groups = {"third"})
    public void validateEmailPasswordLogin() throws InterruptedException {
        mfHomePage.signInPage();
        mfLoginPage.validateEmailPasswordLogin();
    }

 //  @Test(priority =3,groups = {"first"})
   public void fillEmailAndPasswordPressEnterAndValidateError() throws InterruptedException {
        mfHomePage.signInPage();
        mfLoginPage.fillEmailAndPasswordPressEnterAndValidateError();
        WebDriverWait waitForErrorToLoad = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitForErrorToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mfLoginPage.errorMsg)));
       System.out.println(errorText);;
    }

   // @Test(priority = 2, groups = {"second"})
    public void ValidateCheckbox() throws InterruptedException {
        mfHomePage.signInPage();
        mfLoginPage.validateCheckbox();
    }

 //@Test
    public void SignupAndValidateOptions() throws InterruptedException {
        mfSignUpPage.signUpPage();
        mfSignUpPage.dropDown();
    }

   //@Test
    public void tabOpener() throws InterruptedException {
        mfHomePage.tabOpener(0);
    }

    //@Test
    //public void pixelsOption2() throws InterruptedException{
        //mfHomePage.pixelOption(3000);


   // @Test
    public void waitingTime() throws InterruptedException{
        mfHomePage.waitSuggested(5);
    }


   // @Test
    public void hardAssertions() throws InterruptedException{

        mfHomePage.signInPage();

        String emailText = driver.findElement(By.xpath(textForEmailTitle)).getText();
        Thread.sleep(4000);
        int loginOptionsSize;
        List<WebElement> elementList = driver.findElements(By.xpath(loginOptions));
        loginOptionsSize = elementList.size();

        mfLoginPage.fillingCredentials(mfLoginPage.emailCredentials, mfLoginPage.passwordCredentials);
        mfLoginPage.validateCheckbox();
        mfLoginPage.errorText();
        boolean rememberMeChecked = driver.findElement(By.xpath(rememberMe)).isSelected();

        Assert.assertEquals(emailText,"Email"); //String/pass

        Assert.assertEquals(loginOptionsSize,3); //int/pass
        System.out.println(loginOptionsSize);

        Assert.assertEquals(errorText,"Error: email is incorrect"); //String/pass
        System.out.println(errorText);

        Assert.assertFalse(rememberMeChecked,"False"); // boolean/fail

    }

//@Test
    public void assertSoft() throws InterruptedException{

        SoftAssert softAssert = new SoftAssert();

    mfHomePage.openWebsite();
    boolean signupBtnDisplayed = driver.findElement(By.xpath(signupBtn)).isDisplayed();
    mfSignUpPage.signUpPage();


    softAssert.assertEquals(signupBtnDisplayed,false); //boolean/fail
    System.out.println(signupBtnDisplayed);

    mfSignUpPage.dropDown();
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


@Test
public void buttnNotDisplayed() throws InterruptedException{
        SoftAssert softAssert = new SoftAssert();
    mfHomePage.openCourseGallery();
    boolean isDisplayedt;
    if (driver.findElement(By.xpath(historyBttn)).isDisplayed())
         isDisplayedt = true;
    else isDisplayedt = false;
    softAssert.assertEquals(isDisplayedt,false); //String/fail
    System.out.println(isDisplayedt);

    softAssert.assertAll();
    }

    //SoftAssert softAssert = new SoftAssert();
        //boolean getText;
        //if (driver.findElement(By.xpath(historyBttn)).isDisplayed())
           // getText = true;
      //  else getText = false;
       // softAssert.assertEquals(getText,true); //String/fail
        //System.out.println(getText);

       // softAssert.assertAll();



//@Test
    public void validateHistory() throws InterruptedException{
    mfHomePage.signInPage();
    mfLoginPage.fillEmailAndPasswordPressEnterAndValidateError();
    Thread.sleep(3000);
    mfHomePage.openCourseGallery();
    mfGalleryPage.historyBttnIsDisplayed();

    }



}

