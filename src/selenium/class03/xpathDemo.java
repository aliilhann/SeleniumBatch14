package selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ali");
      //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
      driver.findElement(By.xpath(" //button[contains(@type,sub)]")).click();
    }

}
