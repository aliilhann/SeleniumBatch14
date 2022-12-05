package Review.ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//ul/li[@id=\"item-0\" and @class=\"btn btn-light \"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("ali ilhan");
        driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("a@gmail.com");
        driver.findElement(By.xpath("//textarea[starts-with(@id,'current')]")).sendKeys("odessa");
        driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("odessa");
        driver.findElement(By.id("submit")).click();


    }
}
