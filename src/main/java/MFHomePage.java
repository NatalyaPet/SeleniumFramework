package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MFHomePage extends BaseMain{

    public MFHomePage(ChromeDriver driver){super(driver);}
    public String myForkUrl = "https://test.my-fork.com/";
    public String logInBtn = "//a[@class='menu-item log-in-button']/div";
    public String signInBtn = "//button[contains(text(),'Log In')]";

   public void openWebsite()throws InterruptedException {
       driver.get(myForkUrl);

   }
    public void signInPage() throws InterruptedException {

        driver.get(myForkUrl);
        driver.findElement(By.xpath(logInBtn)).click();

    }

}
