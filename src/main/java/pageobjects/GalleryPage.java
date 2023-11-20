package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class GalleryPage extends BaseMain {
    public GalleryPage(ChromeDriver driver) {
        super(driver);
    }

    public String historyBttn = "//a[contains(text(),'History')]";
    public String myForkUrl = "https://test.my-fork.com/";
    public String courseGallery = "//div[contains(text(),'Course Gallery')]";
    public String numberOfQuestions = "//div[@id='area-quiz-select']/div[2]/div[@class='quiz-item-bottom-block']/div[@class='quiz-item-questions-count']";
    public String expertiseList = "//div[@class='expertise-areas-list']/div";
    public String startBttn = "//a[@ href='/quiz/run/10']/div";


    public void historyBttnNotDisplayed() throws InterruptedException {
        String historyText = driver.findElement(By.xpath(historyBttn)).getText();
        System.out.println(historyText);
        String expected = "History";
        System.out.println(expected);
        // try {
        // driver.findElement(By.xpath(historyBttn));
        //return false;
        // } catch (org.openqa.selenium.NoSuchElementException e) {
        // return true;
    }


   // public void listOfExpertise() throws InterruptedException {
     //   WebElement searchElementsList;
      // searchElementsList = driver.findElement(By.xpath(expertiseList));
       // Select searchExpertise = new Select(searchElementsList);
     //   List<WebElement> options = new ArrayList<>();
     //   options = searchExpertise.getOptions();
      //  for (int i = 0; i < options.size(); i++) {
       //     System.out.println(options.get(i).getText());



        public boolean noHistory() throws InterruptedException{ //works
        try {
            driver.findElement(By.xpath(historyBttn));
            return false;
        }catch (NoSuchElementException e){
            System.out.println("element does not exist");
            return true;
        }

        }
      //  public void listOfOptions() throws InterruptedException{
      //      driver.findElements(By.xpath(expertiseList));
      //      String optionsText;
    //       List<WebElement> elementList = driver.findElements(By.xpath(expertiseList));
     //      optionsText = String.valueOf(elementList.toString());
    //       System.out.println(optionsText);


       // public void options1() throws InterruptedException{
      //  driver.findElements(By.xpath(expertiseList));
      //  String positions = "Development, Testing, Business Analyst, Agile, Project Management";
        //boolean verification = positions.contains("Development, Testing, Business Analyst, Agile, Project Management");
          //  System.out.println(verification);




        public void historyBttnIsDisplayed() throws InterruptedException { //working
            // driver.findElement(By.xpath(courseGallery)).click();
            String historyText = driver.findElement(By.xpath(historyBttn)).getText();
            System.out.println(historyText);

        }

        public void questionsCount () throws InterruptedException { //working
            System.out.println(driver.findElement(By.xpath(numberOfQuestions)).getText());

        }
     //   public double questionsCount2() { //works (not used)
      //  String num = driver.findElement(By.xpath(numberOfQuestions)).getText();
       // double numOfQuestionsInt = Integer.parseInt(num.substring(num.indexOf("/") + 2));
       // return numOfQuestionsInt;


    public void expertiseOptionsText() throws InterruptedException { //working
            List<WebElement> elementList = driver.findElements(By.xpath(expertiseList));
            System.out.println(elementList.size());
            for (WebElement element : elementList) {
                System.out.println(element.getText());

            }
        }

    //public int optionsText2(){ //working No sout
          //  int count = driver.findElements(By.xpath(expertiseList)).size();
         //   return count;


       // public int optionsText3(){  //working No sout
         //   return driver.findElements(By.xpath(expertiseList)).size();


        public void openQuizPage() throws InterruptedException{
        driver.findElement(By.xpath(startBttn)).click();

}


}





