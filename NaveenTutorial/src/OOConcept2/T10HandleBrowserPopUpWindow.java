package OOConcept2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T10HandleBrowserPopUpWindow {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        
        WebDriver cdriver = new ChromeDriver();
        
        cdriver.get("http://www.popuptest.com/goodpopups.html");
        
        cdriver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
        
        Thread.sleep(2000);
        
        // Returns the number of windows
        Set<String> s1=cdriver.getWindowHandles();
        
        //Iterate with help of Iterator, make the change like remove the value
        Iterator<String> it = s1.iterator();
        
        String parentWindowId = it.next();
        System.out.println("parent window id is "+ parentWindowId);
        
        String childWindowId = it.next();
        System.out.println("child window id is "+ childWindowId);
        
        cdriver.switchTo().window(childWindowId);
        Thread.sleep(3000);
        
        System.out.println("Child window title "+cdriver.getTitle());
        
        //close child window
        cdriver.close();
        
        //switch to parent window
        cdriver.switchTo().window(parentWindowId);
        
        System.out.println("Parent window title "+cdriver.getTitle());
        
        Thread.sleep(4000);
        
        cdriver.quit();
    }

}
