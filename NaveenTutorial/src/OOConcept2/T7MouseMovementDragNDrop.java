package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class T7MouseMovementDragNDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        Thread.sleep(2000);
        //cdriver.manage().window().fullscreen();
        cdriver.get("http://www.spicejet.com/");
        Thread.sleep(3000);
        cdriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        
        //create Actions class to perform action
        Actions action = new Actions(cdriver);
        
        //move mouse to link text"add-ons" to perform action, but no clicks
        action.moveToElement(cdriver.findElement(By.linkText("ADD-ONS"))).build().perform();
        Thread.sleep(3000);
       
        //click on 'meal' after moving to addons
        //cdriver.findElement(By.linkText("Seat + Meal Combo")).click();
        
        
        Thread.sleep(5000);

       // Thread.sleep(4000);
        //click to default
        cdriver.findElement(By.id("highlight-book")).click();
        
        //booking selection
        Thread.sleep(3000);
        //round trip
        cdriver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
        
        //from
        cdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        cdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("AMD");
        cdriver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("GOI");
        //Select fselect = new Select(cdriver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")));
        //Thread.sleep(2000);
        
        
        
        cdriver.quit();
    }

}
