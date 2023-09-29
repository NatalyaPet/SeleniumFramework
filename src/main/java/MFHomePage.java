package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MFHomePage extends BaseMain{

    public MFHomePage(ChromeDriver driver){super(driver);}
    public String myForkUrl = "https://test.my-fork.com/";
    public String logInBtn = "//a[@class='menu-item log-in-button']/div";

    public String signupBtn = "//div[@id= 'sign-up-button']";
    public String jobTitle = "//select[@id= 'job-title']";



   public void openWebsite()throws InterruptedException {
       driver.get(myForkUrl);

   }
    public void signInPage() throws InterruptedException {

        driver.get(myForkUrl);
        driver.findElement(By.xpath(logInBtn)).click();

    }
    public void signUpPage() throws InterruptedException {
        driver.get(myForkUrl);
        Thread.sleep(4000);
        driver.findElement(By.xpath(signupBtn)).click();
        driver.findElement(By.xpath(jobTitle)).click();
}

    public void dropDown() {

        WebElement searchDropDownElement;
        searchDropDownElement = driver.findElement(By.id("job-title"));
        Select searchDropDown = new Select(searchDropDownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropDown.getOptions();
        for (int i = 0; i < options.size(); i++){
            System.out.println(options.get(i).getText());
        }


    }




}
