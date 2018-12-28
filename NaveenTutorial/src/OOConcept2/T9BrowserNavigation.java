package OOConcept2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T9BrowserNavigation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        cdriver.get("https://www.apple.com.au/");
        Thread.sleep(4000);
        
        //Take screenshot
     // File scrFile = ((TakesScreenshot)cdriver).getScreenshotAs(OutputType.FILE);
     // Now you can do whatever you need to do with it, for example copy somewhere
     
        // fileutils library required
     // FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        
        cdriver.navigate().to("https://www.samsung.com.au/");
        
        cdriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
        
        clickOn(cdriver, cdriver.findElement(By.xpath("//a[@class='s-btn-toggler js-toggler js-depth1-link'][contains(text(),'MOBILE')]")), 20);
        Thread.sleep(3000);
        //cdriver.navigate().back();
        cdriver.navigate().to("https://www.ebay.com.au/");
        clickOn(cdriver, cdriver.findElement(By.xpath("//img[@class='gh-ep']")), 20);
        
        Thread.sleep(3000);
        //cdriver.navigate().refresh();
        
        Thread.sleep(3000);
        cdriver.quit();
    }
    public static void clickOn(WebDriver cdriver, WebElement locator, int timeout) {
        new WebDriverWait(cdriver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
    
}
