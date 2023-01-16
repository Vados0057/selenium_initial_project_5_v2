package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutomationExerciseBasePages;

public class AutomationExerciseTest extends AutomationExerciseBase {

    @BeforeMethod
    public void setPage(){
        automationExerciseBasePages = new AutomationExerciseBasePages();
    }

    @Test(priority = 1, description = "Validate Automation Exercise site logo")
    public void validateAutomationExerciseLogo(){
        Assert.assertTrue(automationExerciseBasePages.logo.isDisplayed());
    }
    
    @Test(priority = 2, description = "Validate Automation Exercise site header items")
    public void validateAutomationExerciseHeaderElements(){

        String[] expectedText = {"Home", "\uE8F8 Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};
        for (int i = 0; i < automationExerciseBasePages.headerElements.size(); i++) {
            Assert.assertTrue(automationExerciseBasePages.headerElements.get(i).isDisplayed());
            Assert.assertEquals(automationExerciseBasePages.headerElements.get(i).getText(), expectedText[i]);
        }
    }

    @Test(priority = 3, description = "Validate Automation Exercise site SUBSCRIPTION form")
    public void validateAutomationExerciseSubscription(){
    Assert.assertTrue(automationExerciseBasePages.textSubscription.isDisplayed());
    Assert.assertTrue(automationExerciseBasePages.email.isDisplayed());
    Assert.assertEquals(automationExerciseBasePages.email.getAttribute("placeholder"), "Your email address");
    Assert.assertTrue(automationExerciseBasePages.submitButton.isDisplayed());
    Assert.assertTrue(automationExerciseBasePages.textSubscription.isDisplayed());
    }

    @Test(priority = 4, description = "Validate Automation Exercise site footer")
    public void validateAutomationExerciseFooter(){
        Assert.assertTrue(automationExerciseBasePages.footer.isDisplayed());
        Assert.assertEquals(automationExerciseBasePages.footer.getText(),"Copyright © 2021 All rights reserved");
    }

}
