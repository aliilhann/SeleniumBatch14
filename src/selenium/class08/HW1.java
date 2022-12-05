package selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeBtn=driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();

       // WebDriverWait wait=new WebDriverWait(driver,20);
     //   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));

        WebElement message=driver.findElement(By.xpath("//p[@id='message']"));
        String text=message.getText();
        System.out.println("The text is : " + text);

        WebElement enableBtn=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();

        WebDriverWait wait1=new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));

        WebElement enabledText=driver.findElement(By.xpath("//p[@id='message']"));
        String textEnabled=enabledText.getText();
        System.out.println("Enabled text is : "+textEnabled);

        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Hola");

        WebElement disableBtn=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();

        WebDriverWait wait2=new WebDriverWait(driver,20);
       wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));

        WebElement disabledText=driver.findElement(By.xpath("//p[@id='message']"));
        String textDisabled=disabledText.getText();
        System.out.println("Disabled text is : "+textDisabled);

    }
}
// i think, it is because of the webpage, for this webpage all of them would work ,even just implicit works