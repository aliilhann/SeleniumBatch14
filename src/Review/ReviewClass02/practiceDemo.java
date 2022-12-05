package Review.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //       When user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
//        send the user name
        userName.sendKeys("Admin");

//        Then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");

//        Then user clicks on login Button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();
        WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error=errorMessage.getText();
        //System.out.println(error);
        if(error.equalsIgnoreCase("Invalid credentials")) {
            System.out.println(error+ " code is over there");
        }


    }
}
