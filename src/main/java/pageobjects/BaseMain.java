package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseMain {

    public static ChromeDriver driver;

    public BaseMain(ChromeDriver driver) {
        BaseMain.driver = driver;

    }

    public void Tab(int tabs) {

        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandler.get(tabs));
    }

    public void scrollBy(int pixels) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0" + pixels + ")", "");
    }
}






