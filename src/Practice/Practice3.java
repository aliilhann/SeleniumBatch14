package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement categories=driver.findElement(By.name("_sacat"));
        Select select=new Select(categories);

        List<WebElement>options=select.getOptions();
        for(WebElement option:options) {
          String text=option.getText();
            System.out.println(text);

            if(text.equalsIgnoreCase("Computers/Tablets & Networking")) {
                option.click();
            }
        }
        WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is wrong");
        }








        }

    }

