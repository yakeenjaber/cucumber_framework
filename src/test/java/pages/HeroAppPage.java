package pages;

import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HeroAppPage {
    public HeroAppPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li>a")
    public List<WebElement> categoryLinks;

    @FindBy(css = "#content>h3")
    public WebElement addRemoveHeading3;

    @FindBy(css = ".example>button")
    public WebElement addElementButton;

    @FindBy(css = "#elements>button")
    public WebElement deleteElementButton;

    @FindBy(css = ".example>h3")
    public WebElement contextMenuHeading3;

    @FindBy(css = ".example>p:nth-child(2)")
    public WebElement contextMenuParagraph1;

    @FindBy(css = ".example>p:nth-child(3)")
    public WebElement contextMenuParagraph2;

    @FindBy(id = "hot-spot")
    public WebElement rectangleBox;

    @FindBy(id = "username")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(css = ".radius")
    public WebElement loginButton;

    @FindBy(id = "flash-messages")
    public WebElement loginErrorMessage;


    public void clickOnCategoryLink(String linkText){
        for(WebElement link : categoryLinks){
            if(link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }
}