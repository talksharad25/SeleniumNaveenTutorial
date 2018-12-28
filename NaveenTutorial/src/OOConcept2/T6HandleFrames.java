package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6HandleFrames {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        
        //URL
        cdriver.get("https://www.freecrm.com/index.html");
        //Username and password
        
        Thread.sleep(3000);
        
        cdriver.findElement(By.name("username")).sendKeys("jammiebondy");
        cdriver.findElement(By.name("password")).sendKeys("JamesBond007");
        //submit login
        cdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
        
        Thread.sleep(5000);
        //switch to mainpanel frame
        cdriver.switchTo().frame("mainpanel");
       
        cdriver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        
        Thread.sleep(3000);
        cdriver.quit();
        
    }

}
