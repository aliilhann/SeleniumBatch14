package selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();

        WebElement recruitment = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitment.click();

        driver.findElement(By.id("candidateSearch_fromDate")).click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(month);
        select.selectByVisibleText("Aug");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(year);
        select1.selectByVisibleText("2023");


        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day : days) {
            String dayText = day.getText();
            if (dayText.equalsIgnoreCase("8")) {
                day.click();
            }


        }
    }
}
