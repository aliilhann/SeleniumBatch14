package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        //WebElement checkbox=driver.findElement(By.id("isAgeSelected"));
        //checkbox.click();
        WebElement option=driver.findElement(By.xpath("//input[@value='Option-1']"));
        option.click();
        System.out.println( option.isSelected());


    }
}
