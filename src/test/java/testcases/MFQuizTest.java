package testcases;

import org.testng.annotations.Test;

public class MFQuizTest extends BaseTest {

    @Test
    public void firstAnswer() throws InterruptedException{
        mfQuizPage.firstQuestion();
        mfProgressPage.firstQuestionProgress();

    }

    @Test
    public void progressBarValidation() throws InterruptedException{
        mfQuizPage.validateProgressBarPage2();
    }

    @Test
    public void secondAnswer() throws InterruptedException{
        mfQuizPage.secondQuestion();
        mfProgressPage.secondQuestionProgress();

    }



}


