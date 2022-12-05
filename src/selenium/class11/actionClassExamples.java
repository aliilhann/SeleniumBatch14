package selenium.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sun.awt.windows.ThemeReader;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class actionClassExamples {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightClick).perform();

        WebElement editBtn=driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();

        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();


    }
}
