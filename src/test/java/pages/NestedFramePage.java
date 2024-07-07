package pages;

import HelperMethods.ElementsMethod;
import HelperMethods.FrameMethods;
import HelperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramePage {

    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public PageMethods pageMethods;
    public FrameMethods frameMethods;


    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        pageMethods = new PageMethods(driver);
        frameMethods = new FrameMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement childFrame;

    @FindBy(xpath = "//p")
    public WebElement text;

    public void interactWithNestedFrame(){
        frameMethods.switchToFrame("frame1");
        frameMethods.switchToFrame(childFrame);
        System.out.println(text.getText());

    }

}