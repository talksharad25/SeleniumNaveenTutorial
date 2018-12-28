package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlertPopUp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver" );
        WebDriver cdriver = new ChromeDriver();
        
//        cdriver.get("https://www.apple.com.au/");
//        cdriver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']")).click();
//        cdriver.findElement(By.xpath("//a[@href='/au/mac/']")).click();
//        Thread.sleep(3000);
        
        cdriver.get("https://www.catch.com.au/");
        
        Thread.sleep(3000);
        
        cdriver.findElement(By.xpath("//input[@id=\"search-input\"]")).sendKeys("nike");
        cdriver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        
        cdriver.quit();
        
        
        
        
        
    }

}
