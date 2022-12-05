package selenium.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.name("customer.firstName")).sendKeys("ali");
        driver.findElement(By.name("customer.lastName")).sendKeys("ilhan");
        driver.findElement(By.id("customer.address.street")).sendKeys("conley");
        driver.findElement(By.id("customer.address.city")).sendKeys("odessa");
        driver.findElement(By.id("customer.address.state")).sendKeys("TX");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("79762");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-78-90");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("aliilhan");
        driver.findElement(By.id("customer.password")).sendKeys("abcdef");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abcdef");
        driver.findElement(By.className("button")).click();







    }
}
