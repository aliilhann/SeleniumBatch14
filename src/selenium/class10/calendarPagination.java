package selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarPagination {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //go to the website
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


        boolean idFound=false;
        while(!idFound) {
            List<WebElement> columnID = driver.findElements(By.xpath("//tbody/tr/td[2]"));
            for (int i = 0; i < columnID.size(); i++) {
//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("41926A")) {
//                check the checkbox associated with this particular  row
                    System.out.println("i have found the id on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){
                driver.findElement(By.xpath("//a[text()='Next']")).click();
            }
        }

    }
}

