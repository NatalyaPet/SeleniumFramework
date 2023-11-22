package pageobjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressPage extends BaseMain {
    public ProgressPage(ChromeDriver driver) {
        super(driver);
    }
    public String url1 = "https://test.my-fork.com/quiz/1773";
    public String progressBar1 = "//div[@id='quiz-process-progress-data' and '>11%<']";



    public void firstQuestionProgress() throws InterruptedException {

        int answeredQuestions = 1;
        int totalQuestions = 9;
        System.out.println(answeredQuestions);
        System.out.println(totalQuestions);
        int expectedProgress = (answeredQuestions * 100) / totalQuestions;
        //System.out.println(expectedProgress);
        WebElement progressBar = driver.findElement(By.xpath(progressBar1));
        String actualProgressText = driver.findElement(By.xpath(progressBar1)).getText();
        System.out.println(actualProgressText);
        int actualProgress = Integer.parseInt(actualProgressText.replaceAll("\\D", ""));
       // System.out.println(actualProgress);
        Assert.assertEquals(actualProgress, expectedProgress, "Progress bar value does not match");
        System.out.println("both values are matched");

    }
    public void secondQuestionProgress() throws InterruptedException {
        int answeredQuestions = 2;
        int totalQuestions = 9;
        System.out.println(answeredQuestions);
        System.out.println(totalQuestions);
        int expectedProgress = (answeredQuestions * 100) / totalQuestions;
        //System.out.println(expectedProgress);
        WebElement progressBar = driver.findElement(By.xpath(progressBar1));

        String actualProgressText = driver.findElement(By.xpath(progressBar1)).getText();
        System.out.println(actualProgressText);

        int actualProgress = Integer.parseInt(actualProgressText.replaceAll("\\D", ""));
        // System.out.println(actualProgress);

        Assert.assertEquals(actualProgress, expectedProgress, "Progress bar value does not match");
        System.out.println("both values are matched");

    }

}




