package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseMain {

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public String myForkUrl = "https://test.my-fork.com/";
    public String logInBtn = "//a[@class='menu-item log-in-button']/div";
    //public String scrollBy = "window.scrollBy(0,4000)";
    //public By scrollBy = ("window.scrollBy(0," + 2000 + ")","");
    public String expertiseLvl = "//div[@class='expertise-areas-list']//div";
    public String courseGallery = "//div[contains(text(),'Course Gallery')]";

    public void openWebsite() throws InterruptedException {
        driver.get(myForkUrl);

    }

    public void tabOpener(int tabs) throws InterruptedException {
        driver.get(myForkUrl);
        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandler.get(tabs));
        System.out.println(tabHandler.size());
    }

        public void signInPage() {
        driver.get(myForkUrl);
        driver.findElement(By.xpath(logInBtn)).click();

        }

    public void pixelsOption(int pixels) {
        driver.get(myForkUrl);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        System.out.println(pixels);

    }
//   public void pixelOption(int pixels) {
//   scrollBy(3000);
//        waitSuggestedItemSection(2);
//        Assert.assertEquals(suggestItemEqualCount()1);



   public void waitSuggested(int expectedNumber){
        WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitTime.until(ExpectedConditions.numberOfElementsToBe(By.xpath(expertiseLvl), expectedNumber));
}
  public void openCourseGallery(){
        driver.get(myForkUrl);
        driver.findElement(By.xpath(courseGallery)).click();
    }

}




