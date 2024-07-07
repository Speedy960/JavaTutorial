package pages;

import HelperMethods.ElementsMethod;
import HelperMethods.FrameMethods;
import HelperMethods.PageMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public PageMethods pageMethods;
    public FrameMethods frameMethods;


    public FramePage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        pageMethods = new PageMethods(driver);
        frameMethods = new FrameMethods(driver);
        PageFactory.initElements(driver, this);


    }

    @FindBy(id="sampleHeading")
    public WebElement iFrameText;

    @FindBy(id="sampleHeading")
    public WebElement iFrameText2;

    @FindBy(xpath="//span[text()='Nested Frames']")
    public WebElement nestedFrames;

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement childFrame;

    @FindBy(xpath = "//p")
    public WebElement text;

    public void interactWithBigFrame(){
        frameMethods.switchToFrame("frame1");
        System.out.println(iFrameText.getText());
        frameMethods.defaultContent();
    }

    public void interactWithSmallFrame(){
        frameMethods.switchToFrame("frame2");
        System.out.println(iFrameText2.getText());
        frameMethods.defaultContent();
    }

    public void navigateToNestedFrame(){
        pageMethods.scrollPage(0, 350);
        elementsMethod.clickElement(nestedFrames);
    }

}
