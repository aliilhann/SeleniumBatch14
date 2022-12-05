package selenium.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HW {
    /*
    goto https://demo.guru99.com/test/simple_context_menu.html
       right click  on the button, select edit and handle the alert
       double click on the button and handle the alert
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();

        WebElement editBtn=driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleClick).perform();

        Alert alert1=driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();



    }
}
