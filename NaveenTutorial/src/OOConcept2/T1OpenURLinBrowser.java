    package OOConcept2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class T1OpenURLinBrowser {

    public static void main(String[] args) throws InterruptedException {
     // firefox - geckodriver 
        System.setProperty("webdriver.gecko.driver", "/Users/newuser/Downloads/Installed/geckodriver");
        WebDriver fdriver = new FirefoxDriver();
        fdriver.get("https://www.google.com");
        
        Thread.sleep(3000);
        
        fdriver.quit();
        
      // safari browser - already got driver, no need to download and import
        
        WebDriver Sdriver = new SafariDriver();
        
        Sdriver.get("https://www.apple.com/au/");
        System.out.println(Sdriver.getTitle());
        System.out.println(Sdriver.getCurrentUrl());
        
        Thread.sleep(3000);
        Sdriver.quit();
        
        // 2.Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        
        cdriver.get("https://www.google.com.au/");
        
        System.out.println(cdriver.getCurrentUrl());
        System.out.println(cdriver.getTitle());
        
        if(cdriver.getTitle().equals("Google")) {
        System.out.println("Title is correct");}
        
        else {
            System.out.println("Title is not correct");
        }
        Thread.sleep(3000);
        cdriver.quit();
        }
        
}
