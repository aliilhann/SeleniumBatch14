package selenium.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.tools.jar.resources.jar;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
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

        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();


        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        List<WebElement> idList = driver.findElements(By.xpath("//tbody/tr/td[2]"));

        for (int i = 0; i < idList.size(); i++) {
            String text = idList.get(i).getText();
            int rowNumber=i+1;

            if (text.equals("44965A")) {


              // WebElement clickBtn=driver.findElement(By.xpath("//tbody/tr"+rowNumber+"/td[1]"));
                List<WebElement> clickBtn = driver.findElements(By.xpath("//tbody/tr/td[1]"));
                clickBtn.get(i).click();
               // clickBtn.click();




            }
        }
    }// but it is not gonna for the first element
} //it can be because of webpage, also some of us had clicking issue