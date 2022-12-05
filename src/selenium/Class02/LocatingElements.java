package selenium.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.id("email")).sendKeys("abcdefg");
        webDriver.findElement(By.name("pass")).sendKeys("12345");
       //webDriver.findElement(By.name("login")).click();

      //  webDriver.findElement(By.linkText("Forgot password?")).click();
       // webDriver.findElement(By.partialLinkText("password?")).click();

    }
}
