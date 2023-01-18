package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AutomationExerciseBasePages;
import utilities.Driver;

import java.util.List;

public class AutomationExerciseBase {

    WebDriver driver;
    AutomationExerciseBase automationExerciseBase;
    AutomationExerciseBasePages automationExerciseBasePages;
    TestCase1_Register_User testCase1_register_user;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        automationExerciseBase = new AutomationExerciseBase();
    }
   @FindBy(css = "ul[class='nav navbar-nav']>li")
   public List<WebElement> headerCards;

    public void clickOnCard( int index){
        headerCards.get(index).click();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
