package selenium.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();

       WebElement password= driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));
       boolean displayStatus= password.isDisplayed();

       if(displayStatus) {
           System.out.println("Password cannot be empty displayed is :" +displayStatus);
       }else {
           System.out.println("Password cannot be empty displayed is :" +displayStatus);
       }


    }
}
