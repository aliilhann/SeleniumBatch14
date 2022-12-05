package selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
       String text=animals.getText();
        System.out.println(text);

        Select select=new Select(animals);
        select.selectByVisibleText("Baby Cat");




    }
 }