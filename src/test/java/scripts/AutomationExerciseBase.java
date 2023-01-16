package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AutomationExerciseBasePages;
import utilities.Driver;

public class AutomationExerciseBase {

    WebDriver driver;
    AutomationExerciseBase automationExerciseBase;
    AutomationExerciseBasePages automationExerciseBasePages;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        automationExerciseBase = new AutomationExerciseBase();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
