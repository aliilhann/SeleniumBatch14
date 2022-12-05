package Review.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
       WebElement categories= driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
        System.out.println(  driver.getTitle());

        Select select=new Select(categories);
        List<WebElement> categoryOptions= select.getOptions();
        for(int i=0; i<categoryOptions.size();i++) {
           String print= categoryOptions.get(i).getText();
            System.out.println(print);
        }
        select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
      //  WebElement title=driver.findElement(By.xpath("//span[text()='Computers, Tablets & Network Hardware']"));
       // System.out.println(title.getText());
        //if(title.equals())
      String title=driver.getTitle();
        System.out.println(title);



    }
}
