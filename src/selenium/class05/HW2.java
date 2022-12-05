package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

    WebElement categories=  driver.findElement(By.xpath("//select[@id='gh-cat']"));
    Select select=new Select(categories);

        List<WebElement> options=select.getOptions();
        for(WebElement option:options) {
           String category= option.getAttribute("value");
            System.out.println(category);
            //System.out.println(option.getText());
        }
        System.out.println("*******************");
        driver.findElement(By.xpath("//option[text()='Computers/Tablets & Networking']")).click();
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        String title=driver.getTitle();

        if(title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println(title +" is verified");
        }else {
            System.out.println(title+ " is not verified");
        }
        System.out.println("Title is : "+ title);
    }
}
