package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExerciseBasePages {

    public AutomationExerciseBasePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='logo pull-left'] img")
    public WebElement logo;

    @FindBy(css = "ul[class='nav navbar-nav']>li")
    public List<WebElement> headerElements;

    @FindBy(css = "div[class='single-widget']>h2")
    public WebElement subscriptionH2;

    @FindBy(id = "susbscribe_email")
    public WebElement email;

    @FindBy(css = "form[class='searchform']>button")
    public WebElement submitButton;

    @FindBy(css = "div[class='single-widget'] p")
    public WebElement textSubscription;

    @FindBy(css = "div[class='footer-bottom'] p")
    public WebElement footer;
}
