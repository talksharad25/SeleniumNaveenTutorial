package OOConcept2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8FindElements {

    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
            WebDriver cdriver = new ChromeDriver();
            cdriver.get("https://www.ebay.com.au/");
            Thread.sleep(2000);
            cdriver.findElement(By.id("gh-ac")).sendKeys("iphone");
        
            List <WebElement> Linklist = cdriver.findElements(By.tagName("a"));
        System.out.println(Linklist.size());
        
        for (int i=0; i<Linklist.size(); i++) {
           
        System.out.println(Linklist.get(i).getText());
       
        }
    }
}
