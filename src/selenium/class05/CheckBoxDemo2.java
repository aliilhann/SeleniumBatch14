package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
      for(WebElement checkbox:checkboxes) {
          String optionName=checkbox.getAttribute("value");
         // System.out.println(optionName);
          if(optionName.equalsIgnoreCase("Option-3")) {
              checkbox.click();
          }

      }
    }
}
