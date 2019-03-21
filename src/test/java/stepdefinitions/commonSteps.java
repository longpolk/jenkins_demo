package stepdefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class commonSteps {
    WebDriver driver;
    String Expectedtitle = "Google";
    public void commonSteps(){
        System.setProperty("webdriver.gecko.driver","E:\\demo-jenkins\\driver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","E:\\demo-jenkins\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I am on Google homepage$")
    public void goToHomePage(){
        commonSteps();
        driver.get("http://google.in");
    }

    @Then("^I see the title is displayed correctly$")
    public void iSeeTheTitleIsDisplayedCorrectly(){
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
        Assert.assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
        driver.quit();
    }
}
