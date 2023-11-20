package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SignUpPage extends BaseMain {

    public SignUpPage(ChromeDriver driver) {
        super(driver);
    }

    public String signupBtn = "//div[@id='sign-up-button']";
    public String jobTitle = "//select[@id='job-title']";
    public String myForkUrl = "https://test.my-fork.com/";

    public void signUpPage() throws InterruptedException {
        driver.get(myForkUrl);
        driver.findElement(By.xpath(signupBtn)).click();
        driver.findElement(By.xpath(jobTitle)).click();
    }

    public void dropDown() throws InterruptedException {

        WebElement searchDropDownElement;
        searchDropDownElement = driver.findElement(By.id("job-title"));
        Select searchDropDown = new Select(searchDropDownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropDown.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());

            //System.out.println(options.get(i));
        }
    }


    }

