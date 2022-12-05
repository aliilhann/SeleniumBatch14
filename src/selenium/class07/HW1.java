package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();

       WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
       helpBtn.click();

       WebElement privacyBtn=driver.findElement(By.xpath(("//a[text()='Privacy']")));
       privacyBtn.click();

     String gmail= driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();

        for(String handle:handles) {
            driver.switchTo().window(handle);

            String title=driver.getTitle();

            if(title.equalsIgnoreCase("Google Account Help")) {
                break;
            }

        }
       WebElement community=driver.findElement(By.xpath("//a[text()='Community']"));
        community.click();

        driver.switchTo().window(gmail);
        WebElement userName=driver.findElement(By.name("Username"));
        userName.sendKeys("aliilhan");




    }
}
