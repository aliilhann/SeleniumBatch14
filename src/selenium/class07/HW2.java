package selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        WebElement newUser=driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUser.click();

      WebElement firstName=  driver.findElement(By.id("First-Name"));
        //WebElement firstName1=  driver.findElement(By.xpath("(//div//div//div//p)[3]"));
        WebElement firstName1=  driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
     String name= firstName1.getText();
       System.out.println("The first name of the user is  "+name);

    }
}
