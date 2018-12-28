package OOConcept2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5AlertPopupHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
       
        cdriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //cdriver.findElement(By.name("proceed")).click();
        cdriver.findElement(By.xpath("//input[@name='proceed']")).click();
        Alert palert = cdriver.switchTo().alert();
        
        System.out.println(palert.getText());
        Thread.sleep(3000); // wait/sleep for 3sec
        palert.accept(); //accept OK alert
        
        
        // palert.dismiss(); // to cancel alert
        
        Thread.sleep(3000);
        cdriver.quit();
        
    }

}
