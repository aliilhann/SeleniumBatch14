package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createBtn.click();
        Thread.sleep(3000);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("ali");

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("ilhan");

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("a@gmail.com");

        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("123455");

        WebElement month=driver.findElement(By.id("month"));
        Select select=new Select(month);
        select.selectByVisibleText("Jan");

        WebElement day=driver.findElement(By.id("day"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("14");

        WebElement year=driver.findElement(By.id("year"));
        Select selectYear =new Select(year);
        selectYear.selectByIndex(33);

       List<WebElement> genderBtn=driver.findElements(By.xpath("//label[@class='_58mt']"));

      for(WebElement gender:genderBtn) {
          String text=gender.getText();
          System.out.println(text);

          if(text.equalsIgnoreCase("Male")) {
              gender.click();
          }
      }




    }
}
