package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLocator {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
        
        cdriver.get("https://www.freecrm.com/register/");
        
        Select planselect = new Select(cdriver.findElement(By.id("payment_plan_id")));
        planselect.selectByVisibleText("Free Edition");
        
        cdriver.findElement(By.name("first_name")).sendKeys("Jammie");
        cdriver.findElement(By.name("surname")).sendKeys("Bondy");
        cdriver.findElement(By.name("email")).sendKeys("talk_sharad25@yahoo.co.in");
        cdriver.findElement(By.name("email_confirm")).sendKeys("talk_sharad25@yahoo.co.in");
        cdriver.findElement(By.name("username")).sendKeys("jammiebondy");
        cdriver.findElement(By.name("password")).sendKeys("JamesBond007");
        cdriver.findElement(By.name("passwordconfirm")).sendKeys("JamesBond007");
        cdriver.findElement(By.name("agreeTerms")).click();
        
        //cdriver.findElement(By.name("submitButton")).click();
        
        
    }

}
