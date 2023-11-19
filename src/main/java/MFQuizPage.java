package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MFQuizPage extends BaseMain {
    public MFQuizPage(ChromeDriver driver) {
        super(driver);
    }

    public String url1 = "https://test.my-fork.com/quiz/1773";
    public By answersBlock = By.xpath("//div[@id='quiz-process-question-block-answers-block']//div");
    //public String progressBar1 = "//div[contains(text(),'11%')]";
    //public String  = "//body/div[@id='app']/div[2]/div[1]/div[4]/div[1]";
    public String questionCounter = "//div[@class='quiz-process-questions']//div";
    public String nextButtn = "//div[contains(text(),'Next')]";
    // public String answer1 = "//div[contains(text(),'Structured Query Language')]";
    //public String answer2 = "//div[contains(text(),'ORDER BY')]";
    public String allQuestions = "//body/div[@id='app']/div[2]/div[1]/div[4]//div";
    public String progressBar2 = "//div[@id='quiz-process-progress-data']";
    public By question = By.xpath("//div[@class= 'quiz-process-question-block-title']/span");
    public By selectAnswer1 = By.xpath("//div[contains(text(),'A')]/.");
    public String selectAnyAnswer = "//div[@id='quiz-process-question-block-answers-block']";
    public By selectAnyAnswer2 = By.xpath("//div[@class='quiz-process-question-block-answers-block']/div[1]");
    public String selectFirstAnswer = "//body/div[@id='app']/div[2]/div[2]/div[2]/div[4]/div[1]";
    public By answerA = By.xpath("//div[@class='quiz-process-question-block-answers-block']/div[1]/div[1]");
    public By backBttn = By.xpath("//div[contains(text(),'Back')]");
    public String progressBar1 = "//div[@id='quiz-process-progress-data' and '>11%<']";
    public List<String> expected = new ArrayList<>();


    public void firstQuestion() throws InterruptedException {
        driver.get(url1);
        driver.findElement(backBttn).click();
        driver.findElement(answerA).click();
        driver.findElement(By.xpath(nextButtn)).click();


        //List<WebElement> listOfElements = driver.findElements(answersBlock);
        //for (int i = 1; i < listOfElements.size(); i++) {
        //   WebElement requiredListOfElements = listOfElements.get(i);
        //   System.out.println(requiredListOfElements);}
        // Random list = new Random();
        //  int randomValue = list.nextInt(listOfElements.size());
        // listOfElements.get(randomValue).click();
        //System.out.println(randomValue);

        // String currentProgress = driver.findElement(By.xpath(progressBar2)).getText();
        // System.out.println(currentProgress);
        // driver.findElement(By.xpath(nextButtn)).click();
        // System.out.println(currentProgress);
    }
    public void validateProgressBarPage2() throws InterruptedException{
        driver.get(url1);
        driver.findElement(By.xpath(progressBar2));
        String currentProgress = driver.findElement(By.xpath(progressBar2)).getText();
        System.out.println(currentProgress);

}
    public void secondQuestion() throws InterruptedException { //works
        driver.get(url1);
        //driver.findElement(backBttn).click();
        driver.findElement(answerA).click();

    }


   // public void validationOfFunctions() throws InterruptedException {
    //    driver.findElement(By.xpath(progressBar2));
  //      String currentProgress = driver.findElement(By.xpath(progressBar2)).getText();
     //   System.out.println(currentProgress);
    //    driver.findElement(answersBlock);
   //     String questionCount = driver.findElement(By.xpath(questionCounter)).getText();
   //     System.out.println(questionCount);
   //     List<WebElement> elementList = driver.findElements(By.xpath(questionCounter));
    //    System.out.println(elementList.size());



  //  public void elementList() throws InterruptedException {

  //      List<WebElement> listOfElements = driver.findElements(answersBlock);
   //     System.out.println(listOfElements);
    //    Random list = new Random();
     //   int randomValue = list.nextInt(listOfElements.size());
     //   listOfElements.get(randomValue).click();
     //   System.out.println(randomValue);

    }

    // public void elementList2 () throws InterruptedException {
    //driver.get(url1);
    // driver.findElement(By.xpath(answer1)).click();
    // String currentProgress = driver.findElement(By.xpath(progressBar2)).getText();
    // driver.findElement(By.xpath(answer2)).click();
    // System.out.println(currentProgress);



        // public double getActualValue() {
        // String value = driver.findElement(By.xpath(progressBar1)).getText();
        //double showActualValue = Integer.parseInt(value.substring(0, value.length() - 1));
        // return showActualValue;




