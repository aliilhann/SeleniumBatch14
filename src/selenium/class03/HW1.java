package selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();
       driver.findElement(By.xpath("//div/a[@href=\"basic-first-form-demo.php\"]")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Please enter your Message\"]")).sendKeys("Hola");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.quit();



    }
}
