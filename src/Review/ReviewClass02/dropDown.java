package Review.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000);

       WebElement selectMonth= driver.findElement(By.xpath("//select[@id='month']"));
       Select select=new Select(selectMonth);
       select.selectByIndex(0);
       List <WebElement>Options=select.getOptions();
       for(int i=0; i<Options.size(); i++) {
           String months=Options.get(i).getText();
           System.out.print(months+" ");
       }
        System.out.println();
       WebElement selectDay=driver.findElement(By.xpath("//select[@id='day']"));
       Select select2=new Select(selectDay);
       select2.selectByValue("14");
       List <WebElement> optionsDays=select2.getOptions();
       for(int i=0; i<optionsDays.size();i++) {
           String days=optionsDays.get(i).getText();
           System.out.print(days+" ");
       }

       WebElement selectYear=driver.findElement(By.xpath("//select[@id='year']"));
       Select select3=new Select(selectYear);
       select3.selectByVisibleText("1989");
       List<WebElement> optionsYear=select3.getOptions();

        for(int i=0; i<optionsYear.size();i++) {
            String years=optionsYear.get(i).getText();
            System.out.println(years);
        }








    }
}
