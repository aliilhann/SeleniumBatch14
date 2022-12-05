package selenium.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        webDriver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        webDriver.findElement(By.className("button")).click();
        String title=webDriver.getTitle();
        //System.out.println(title);
        if(title.equalsIgnoreCase("Web Orders")) {
            System.out.println("Title is correct :"+ title);
        }else {
            System.out.println("The title is incorrect");
        }

    }

}
