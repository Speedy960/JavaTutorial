package tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethod;
import HelperMethods.FrameMethods;
import HelperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.FramePage;
import pages.HomePage;
import pages.NestedFramePage;

import java.time.Duration;



    public class FramesTest {
        public WebDriver driver;

        @Test
        public void metodaTest() {
            //trebuie sa deschidem un browser:
            driver = new ChromeDriver();

            //trebuie sa accesam un url:

            driver.get("https://demoqa.com/");

            AlertMethods alertMethods = new AlertMethods(driver);
            PageMethods pageMethods = new PageMethods(driver);
            ElementsMethod elementsMethods = new ElementsMethod(driver);
            FrameMethods frameMethods = new FrameMethods(driver);

            HomePage homePage = new HomePage(driver);
            homePage.navigateToAlertsMenu();


            pageMethods.scrollPage(0, 360);

            //definim un wait implicit
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(driver);
            alertsWindowsPage.navigateToFramePage();


            //WebElement formMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
            //formMenu.click();
            //elementsMethods.clickElement(formMenu);

            //WebElement frameButton = driver.findElement(By.xpath("//span[text()='Frames']"));
             //alertsButton.click();
            //elementsMethod.clickElement(frameButton);

            FramePage framePage = new FramePage(driver);
            framePage.interactWithBigFrame();
            framePage.interactWithSmallFrame();
            framePage.navigateToNestedFrame();

            NestedFramePage nestedFramePage = new NestedFramePage(driver);
            nestedFramePage.interactWithNestedFrame();

            //ne mutam cu focusul pe un iFrame:
            //driver.switchTo().frame("frame1");
            //frameMethods.switchToFrame("frame1");

            //WebElement iFrameText = driver.findElement(By.id("sampleHeading"));
            //System.out.println(iFrameText.getText());


            //ne intoarcem cu focusul la frame-ul default:
            //driver.switchTo().defaultContent();
            //frameMethods.defaultContent();


            //driver.switchTo().frame("frame2");
            //frameMethods.switchToFrame("frame2");

            //WebElement iFrameText2 = driver.findElement(By.id("sampleHeading"));
            //System.out.println(iFrameText2.getText());

            //driver.switchTo().defaultContent();
            //frameMethods.defaultContent();


            //WebElement nestedFrames = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
            //alertsButton.click();
            //elementsMethod.clickElement(nestedFrames);

            //interactionam cu iframe in iframe:

            //driver.switchTo().frame("frame1");
            //frameMethods.switchToFrame("frame1");

            //WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
            //driver.switchTo().frame(childFrame);
            //frameMethods.switchToFrame(childFrame);

            //WebElement text = driver.findElement(By.xpath("//p"));
            //System.out.println(text.getText());


        }
    }


