package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestWebsitelogin {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        
        cdriver.get("https://www.catch.com.au/");
        Thread.sleep(2000);
        cdriver.findElement(By.xpath("//span[@class='text']")).click();
        Thread.sleep(2000);
        cdriver.findElement(By.id("link-register")).click();
 //       Thread.sleep(3000);
//        cdriver.findElement(By.name("register[firstName]")).click();
//        cdriver.findElement(By.name("register[firstName]")).sendKeys("james");
//        
//        cdriver.findElement(By.xpath("//input[@id='register_lastName']")).click();
//        cdriver.findElement(By.xpath("//input[@id='register_lastName']")).sendKeys("bondy");
//        cdriver.findElement(By.name("register[lastName]")).click();
//        cdriver.findElement(By.name("register[lastName]")).sendKeys("bond");
//        
//        cdriver.findElement(By.name("register[email]")).click();
//        cdriver.findElement(By.name("register[email]")).sendKeys("james.bond@gmail.com");
//        
        cdriver.navigate().to("https://www.ebay.com.au/");
        Thread.sleep(2000);
        Select cselect = new Select(cdriver.findElement(By.id("gh-cat")));
        cselect.selectByVisibleText("Baby");
                
        
        Thread.sleep(5000);
        cdriver.quit();
        
        
    }

}
