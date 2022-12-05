package Review.ReviewClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the web driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();


         */
        driver.get("http://syntaxprojects.com/");

    }
}
