package testcases;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest{

    @Test //scenario1
    public void validateHistoryWithoutSignin() throws InterruptedException {
        homePage.openCourseGallery();
        galleryPage.noHistory();
    }

    @Test
    public void historyDisplayed() throws InterruptedException {
        homePage.signInPage();
        loginPage.fillEmailAndPasswordPressEnterAndValidateError();
        homePage.openCourseGallery();
        galleryPage.historyBttnIsDisplayed();
    }

    @Test //scenario2
    public void menuOptions() throws InterruptedException{
        homePage.openCourseGallery();
        galleryPage.expertiseOptionsText();

    }

    @Test
    public void questionCount() throws InterruptedException{
        homePage.openCourseGallery();
        galleryPage.questionsCount();
    }

    @Test
    public void startSqlTest() throws InterruptedException{
        homePage.openCourseGallery();
        galleryPage.openQuizPage();

    }

    @Test //scenario3
    public void firstAnswer() throws InterruptedException{
        quizPage.firstQuestion();
        progressPage.firstQuestionProgress();

    }

    @Test
    public void progressBarValidation() throws InterruptedException{
        quizPage.validateProgressBarPage2();
    }

    @Test
    public void secondAnswer() throws InterruptedException{
        quizPage.secondQuestion();
        progressPage.secondQuestionProgress();

    }


}






