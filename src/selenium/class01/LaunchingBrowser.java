package selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.google.com/");

        //get the url of the website
        String URL =driver.getCurrentUrl();
        System.out.println(URL);

        String title= driver.getTitle();
       System.out.println(title);
       driver.quit();


    }
}
