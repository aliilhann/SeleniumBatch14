package selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");
       WebElement checkbox= driver.findElement(By.id("a"));
       checkbox.click();

       driver.switchTo().defaultContent();

       driver.switchTo().frame("frame2");
       WebElement animalsBox=driver.findElement(By.xpath("//select[@id='animals']"));

       Select select=new Select(animalsBox);
      select.selectByVisibleText("Baby Cat");
      driver.switchTo().defaultContent();
      driver.switchTo().frame("frame1");
      WebElement topic=driver.findElement(By.xpath("//input"));
      topic.sendKeys("DONE");






    }
}
