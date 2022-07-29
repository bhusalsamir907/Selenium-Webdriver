package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {
    public static void main(String [] args){

        System.setProperty("webdriver.gecko.driver","D:\\Broadway Infosis QA\\geckodriver-v0.31.0-win64\\geckodriver.exe");

//  Making Firefox Headless Browser
//  need to pass 'options' object to FirefoxDriver as parameter
//  only then headless browser is created
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

        WebDriver driver = new FirefoxDriver(options);
        System.out.println("<------------Headless Browser Testing in Selenium Java------------->");
        System.out.println("-> Firefox Browser is Opened");

        driver.manage().window().maximize();
        System.out.println("-> Windows is Maximized");

        driver.get("https://www.nopcommerce.com/");
        System.out.println("-> Routed to the Website");
        System.out.println("Title of Page : "+driver.getTitle());













        driver.quit();
        System.out.println("-> Browser is closed");


    }
}
