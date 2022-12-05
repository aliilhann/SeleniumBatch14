package selenium.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("aLi");
        driver.findElement(By.name("lastname")).sendKeys("iLhan");
        driver.findElement(By.name("reg_email__")).sendKeys("aLi@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aLi@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        driver.findElement(By.name("birthday_month")).sendKeys("January");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();









    }
}
