package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        List<WebElement> ebayLinks= driver.findElements(By.tagName("a"));
        System.out.println("the size of the list is "+ebayLinks.size());

        for (WebElement ebayLink:ebayLinks) {
          String link=  ebayLink.getAttribute("href");
            System.out.println(link);
        }
    }
}

