package selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("aLi");
        driver.findElement(By.name("lastname")).sendKeys("iLhan");
        driver.findElement(By.name("reg_email__")).sendKeys("aLi@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aLi@gmail.com");
/*
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        driver.findElement(By.name("birthday_month")).sendKeys("January");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
 */
       WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(month);
        select.selectByIndex(0);

        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("14");

        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear=new Select(year);
        selectYear.selectByVisibleText("1989");

        List <WebElement>  genderButton = driver.findElements(By.xpath("//label[@class='_58mt']"));
        for(WebElement genderbtn:genderButton) {
            String male=genderbtn.getText();
            if(genderbtn.getText().equalsIgnoreCase("Male")) {
                genderbtn.click();

            }
        }





    }
}
