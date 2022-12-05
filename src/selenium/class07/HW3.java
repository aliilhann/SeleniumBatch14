package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
       WebElement startBTn= driver.findElement(By.id("startButton"));
        startBTn.click();

      WebElement text=  driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
      String printText=text.getText();
        System.out.println(printText);



    }
}
