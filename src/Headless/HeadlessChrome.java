package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
     public  static void main(String [] args){

         System.setProperty("webdriver.chrome.driver","D:\\Broadway Infosis QA\\chromedriver_win32\\chromedriver.exe");

//         Making Chrome Headless Browser
//         need to pass 'options' object to ChromeDriver as parameter
//        only then headless browser is created

         ChromeOptions options = new ChromeOptions();
//         options.setHeadless(true);
         options.addArguments("--headless");

         WebDriver driver = new ChromeDriver(options);
         System.out.println("<------------Headless Browser Testing in Selenium Java------------->");
         System.out.println("-> Chrome Browser is Opened");

         driver.manage().window().maximize();
         System.out.println("-> Windows is Maximized");


         driver.get("https://www.nopcommerce.com/");
         System.out.println("-> Routed to 'nopcommerce' Website");
         System.out.println("-> Getting Title of the Page From Headless Browser : "+driver.getTitle());








         driver.quit();
         System.out.println("-> Browser is closed");

     }

}
