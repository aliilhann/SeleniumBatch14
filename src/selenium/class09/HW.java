package selenium.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        String path="Data/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
       properties.load(fileInputStream);

       driver.get(properties.getProperty("URL"));
      WebElement userName=driver.findElement(By.id("txtUsername"));
      userName.sendKeys(properties.getProperty("username"));

      WebElement password=driver.findElement(By.id("txtPassword"));
      password.sendKeys(properties.getProperty("password"));

      WebElement loginBtn=driver.findElement(By.xpath("//input[@class='button']"));
      loginBtn.click();

      WebElement pim=driver.findElement(By.xpath("//b[text()='PIM']"));
      pim.click();

      WebElement employeeList=driver.findElement(By.xpath("//a[text()='Employee List']"));
      employeeList.click();

      List<WebElement> id=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

      for(int i=0; i<id.size(); i++) {
          String text=id.get(i).getText();
          int rowNumber=i+1;

          if(text.equalsIgnoreCase("45026A")) {

              WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+rowNumber+"]/td[1]"));
              checkBox.click();
              break;

          }
      }
 //now our confusion is in a loop, so we keep confusing and confusing



    }
}

