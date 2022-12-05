package selenium.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFile {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
       upload.sendKeys("C:\\Users\\Ilhan\\Desktop\\509 McCraw CDA.docx");
        WebElement login=driver.findElement(By.xpath("//input[@id='file-submit']"));
       login.click();
    }
}
