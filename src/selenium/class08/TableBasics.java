package selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasics {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //print the whole table on the console
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));

        String tableText=table.getText();
        System.out.println(tableText);
        System.out.println("********************");

 //      print all the rows of the table
//        modification print all the rows which have the company google

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row:rows) {
            String text=row.getText();
            //System.out.println(text);
           // System.out.println("**************");
            if(text.contains("Google")) {
                System.out.println(text);
            }


        }





    }
}
