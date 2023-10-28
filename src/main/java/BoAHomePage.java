package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BoAHomePage extends BoABaseMain {

    public BoAHomePage(ChromeDriver driver) {
        super(driver);
    }

    public String boaURL = "https://www.bankofamerica.com/smallbusiness/";
    public String creditCardBtn = "//a[@id='navCreditCards']";
    public String toolOptions = "//ul[@id='bmhCarousel']//li";


    public void openWebsite() throws InterruptedException{
        driver.get(boaURL);
    }

    public void ccTab() throws InterruptedException{
        driver.findElement(By.xpath(creditCardBtn)).click();

    }
   public void toolCarouselOptions() throws InterruptedException{
        int toolCarousel;
        List<WebElement> elementList = driver.findElements(By.xpath(toolOptions));
        toolCarousel = elementList.size();
        System.out.println(toolCarousel);


    }

}


