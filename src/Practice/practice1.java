package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

       WebElement password= driver.findElement((By.id("txtPassword")));
        password.sendKeys("Hum@nhrm123");

        WebElement login=driver.findElement(By.id("btnLogin"));
        login.click();

        WebElement welcomeText=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        String text=welcomeText.getText();

        if(text.equalsIgnoreCase("Welcome Admin")) {
            System.out.println(text + " is over there at the top right corner");
        }else {
            System.out.println(text + " is not ver there");
        }



    }
}
