package OOConcept2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T2Locators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver cdriver = new ChromeDriver();
       
        cdriver.get("https://register.theiia.org/");
       // 1. Xpath - only use when id is not available
        //cdriver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("james.bond@gmail.com");
        cdriver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("James");
        cdriver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Bond");
        cdriver.findElement(By.xpath("//input[@id='txtOrganization']")).sendKeys("MI5");
        cdriver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys("secret agent");
        
        // 2. id - preferred use for input
        cdriver.findElement(By.id("txtPassword")).sendKeys("James123");
        cdriver.findElement(By.id("txtConfirmPassword")).sendKeys("James123");
        
        // 3. link click
        //cdriver.findElement(By.linkText("User Agreement")).click();
    
        //4. cssSelector
        cdriver.findElement(By.cssSelector("#txtEmail")).sendKeys("james.bond@gmail.com");
    
        //5. Handle drop box
        // create select class 
        Select select=new Select(cdriver.findElement(By.name("ddlPrimLoc")));
        select.selectByVisibleText("India");
        
        Select jselect = new Select(cdriver.findElement(By.name("ddlJob")));
        jselect.selectByVisibleText("330 - Retired");
        
        Select IGselect = new Select(cdriver.findElement(By.name("ddlIndustryGroups")));
        IGselect.selectByVisibleText(("22 Utilities"));
        
        Select ICselect = new Select(cdriver.findElement(By.name("ddlIndustry")));
        ICselect.selectByVisibleText(("221 Utilities"));
        
        Thread.sleep(5000);
        cdriver.quit();
        //cdriver.findElement(By.name("btnSubmit")).click();
    }

}
