package Review.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@name='color']"));


        for(WebElement checkbox:checkboxes) {
            String color= checkbox.getAttribute("value");
            if(color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("yellow")) {
                checkbox.click();


            }




        }


    }
}
