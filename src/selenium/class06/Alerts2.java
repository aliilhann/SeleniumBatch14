package selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

       WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
       simpleAlert.click();

       Alert simpleAlert1=driver.switchTo().alert();
       simpleAlert1.accept();

     WebElement confirmationAlert= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
     confirmationAlert.click();

     Alert confirmation=driver.switchTo().alert();
     Thread.sleep(3000);
     confirmation.dismiss();

     WebElement promptAlert=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
     promptAlert.click();

     Alert prompt=driver.switchTo().alert();
     prompt.sendKeys("abracadrba");
        System.out.println(prompt.getText());
     Thread.sleep(2000);
     prompt.accept();


    }
}
