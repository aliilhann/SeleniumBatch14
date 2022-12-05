package selenium.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
    public static void main(String[] args) throws InterruptedException {

            // set the path to the driver to link it with our class
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
            driver.manage().window().maximize();
            //  go to the website
            driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//        click on the button "change text to selenium webDriver"
           WebElement selenium= driver.findElement(By.id("populate-text"));
            selenium.click();

//        get the text Selenium WebDriver
            WebElement seleniumText=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
            String text=seleniumText.getText();
            System.out.println(text);

//            click on the button "display text after 10 seconds"
            WebElement displayBtn=driver.findElement(By.id("display-other-button"));
            displayBtn.click();

//        as the button appears up after some time so in order to click it or get text from
//         it we need to define some explicit wait

            WebDriverWait wait=new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
    }

}