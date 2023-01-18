package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Waiter;

public class TestCase1_Register_User extends AutomationExerciseBase {

    public TestCase1_Register_User() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @Test
    public void registerUserValidation() {

        clickOnCard(3);
        Assert.assertTrue(driver.findElement(By.cssSelector(".signup-form>h2")).isDisplayed());
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("qqqwwqw@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("div>h2>b")).isDisplayed());
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("name")).sendKeys("Vlad");
        System.out.println(driver.findElement(By.cssSelector("input[data-qa='email']")).getCssValue("value"));
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Vlad_6131");
        driver.findElement(By.cssSelector("select[id='days']>option[value='9']")).click();
        driver.findElement(By.cssSelector("select[id='months']>option[value='1']")).click();
        driver.findElement(By.cssSelector("select[id='years']>option[value='1997']")).click();
        Waiter.pause(7);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.cssSelector("input[data-qa='first_name']")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("input[data-qa='last_name']")).sendKeys("Bor");
        driver.findElement(By.cssSelector("input[data-qa='company']")).sendKeys("TGSCHOOL");
        driver.findElement(By.cssSelector("input[data-qa='address']")).sendKeys("123 Chicago St.");
        driver.findElement(By.cssSelector("input[data-qa='address2']")).sendKeys("Apt. 505");
        driver.findElement(By.cssSelector("select[data-qa='country']>option[value='United States']")).click();
        driver.findElement(By.cssSelector("input[data-qa='state']")).sendKeys("IL");
        driver.findElement(By.cssSelector("input[data-qa='city']")).sendKeys("Chicago");
        driver.findElement(By.cssSelector("input[data-qa='zipcode']")).sendKeys("Chicago");
        driver.findElement(By.cssSelector("input[data-qa='mobile_number']")).sendKeys("111-123-123-1234");
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-created']")).isDisplayed());
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("ul>li>a> b")).isDisplayed());
        driver.findElement(By.cssSelector("ul>li>a>i[class='fa fa-trash-o']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-deleted']")).isDisplayed());
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        Waiter.pause(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
    }
}
