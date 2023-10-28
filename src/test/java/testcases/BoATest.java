package testcases;

import org.testng.annotations.Test;
import pageobjects.BoAHomePage;

public class BoATest extends BoABaseTest{

    @Test(groups = "first")
    public void openWebsite() throws InterruptedException{
        BoAHomePage.openWebsite();
    }

    @Test(groups = "third")
    public void creditCardTab() throws InterruptedException{
        BoAHomePage.openWebsite();
        BoAHomePage.ccTab();

    }
@Test(groups = "third")
    public void creditCardsOptionsBttn() throws InterruptedException{
    BoAHomePage.openWebsite();
    BoAHomePage.ccTab();

}
@Test(groups = "second")
    public void naviCarousel() throws InterruptedException{
        BoAHomePage.openWebsite();
        BoAHomePage.toolCarouselOptions();
}

}
