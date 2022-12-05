package selenium.class05.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        String path="https://www.google.com/";
        driver.get(path);
       // System.out.println(driver.getCurrentUrl());
      //  System.out.println(driver.getTitle());

        String URL= driver.getCurrentUrl();
        String title= driver.getTitle();
        //driver.quit();
        if(path.equalsIgnoreCase(URL)) {
            System.out.println("Matches");
        }else {
            System.out.println("No match");
        }
        if(title.equalsIgnoreCase("Google")) {
            System.out.println("Match");
        }else {
            System.out.println("No match");
        }
        System.out.println(URL);
        System.out.println(path);
        driver.quit();

     /*   WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Ali Ilhan Realtor", Keys.ENTER);
        System.out.println("Title = " + driver.getTitle());
        Thread.sleep(10000);
        driver.quit();


      */

    }


}
