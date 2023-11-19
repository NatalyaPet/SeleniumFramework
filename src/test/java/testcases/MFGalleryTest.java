package testcases;

import org.testng.annotations.Test;

public class MFGalleryTest extends BaseTest{

    @Test
    public void validateHistoryWithoutSignin() throws InterruptedException {
        mfHomePage.openCourseGallery();
        mfGalleryPage.noHistory();
    }

    @Test
    public void historyDisplayed() throws InterruptedException {
        mfHomePage.signInPage();
        mfLoginPage.fillEmailAndPasswordPressEnterAndValidateError();
        mfHomePage.openCourseGallery();
        mfGalleryPage.historyBttnIsDisplayed();
    }

    @Test
    public void menuOptions() throws InterruptedException{
        mfHomePage.openCourseGallery();
        mfGalleryPage.expertiseOptionsText();

    }

    @Test
    public void questionCount() throws InterruptedException{
        mfHomePage.openCourseGallery();
        mfGalleryPage.questionsCount();
    }

    @Test
    public void startSqlTest() throws InterruptedException{
        mfHomePage.openCourseGallery();
        mfGalleryPage.openQuizPage();

    }




}
