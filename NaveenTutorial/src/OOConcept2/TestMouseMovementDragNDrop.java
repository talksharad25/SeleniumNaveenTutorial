package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class TestMouseMovementDragNDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        
        cdriver.get("http://www.spicejet.com/");
        Thread.sleep(2000);
        
        Actions amove = new Actions(cdriver);
        amove.moveToElement(cdriver.findElement(By.name("ctl00$mainContent$rbtnl_Trip"))).click();
        Thread.sleep(2000);
        
//        Actions amove = new Actions(cdriver);
//        
//        amove.moveToElement(cdriver.findElement(By.id("highlight-addons"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("SpiceClub Membership Offer"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("SpiceCash Topup"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("Hot Meals"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("Hot Meals"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("You 1st"))).build().perform();
//        Thread.sleep(2000);
//        amove.moveToElement(cdriver.findElement(By.linkText("Preferred Bag Out"))).build().perform();
//        
        Thread.sleep(4000);
        cdriver.quit();
    }

}
