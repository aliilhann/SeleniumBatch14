package selenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        Actions action=new Actions(driver);

        WebElement draggableElement=driver.findElement(By.id("draggable"));
        WebElement dropLocation = driver.findElement(By.id("droppable"));

     //  action.dragAndDrop(draggableElement,dropLocation).perform();
        Thread.sleep(2000);

       action.clickAndHold(draggableElement).moveToElement(dropLocation).release().build().perform();



    }
}
