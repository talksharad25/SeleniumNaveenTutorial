package OOConcept2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T7DragNDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        cdriver.get("https://jqueryui.com/droppable/");
        cdriver.switchTo().frame(0);
        
        Actions dactions = new Actions(cdriver);
        
        cdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicitly wait b4 giving error
               
        dactions.clickAndHold(cdriver.findElement(By.xpath("//*[@id=\"draggable\"]"))).
        moveToElement(cdriver.findElement(By.xpath("//*[@id=\"droppable\"]"))).
        release().build().perform();

        Thread.sleep(5000);
        cdriver.quit();
        
    }

}
