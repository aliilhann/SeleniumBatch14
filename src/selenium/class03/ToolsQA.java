package selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String link="https://demoqa.com/text-box";
        driver.get(link);
        driver.manage().window().maximize();
        //driver.findElement(By.id("userName")).sendKeys("aliilhan");
        driver.findElement(By.id("userName")).sendKeys("aliilhan");
        driver.findElement(By.id("userEmail")).sendKeys("a@gmail.com");
        driver.findElement(By.tagName("textarea")).sendKeys("odessa");
        driver.findElement(By.id("permanentAddress")).sendKeys("texas");
        Thread.sleep(1000);
        //driver.findElement(By.className("btn btn-primary")).click();
        driver.quit();



    }
}
