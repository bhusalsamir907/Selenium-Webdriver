package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {
    public static void main( String [] args){
        System.setProperty("webdriver.gecko.driver","D:\\Broadway Infosis QA\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("<------------Navigation Commands Practice------------->");
        System.out.println("-> Firefox Browser is Opened");

        driver.manage().window().maximize();
        System.out.println("-> Windows is Maximized");


        driver.get("https://merolagani.com/NewsList.aspx");
        System.out.println("-> Routed to the Website");
        System.out.println("-> Title of first page : "+driver.getTitle());

        driver.navigate().to("https://www.facebook.com/");
        System.out.println("-> Title from navigate().to() method : "+driver.getTitle());

        driver.navigate().back();
        System.out.println("-> Title from navigate().back() method : "+driver.getTitle());

        driver.navigate().forward();
        System.out.println("-> Title from navigate().forward() method : "+driver.getTitle());

        driver.navigate().refresh();
        System.out.println("-> Page Refreshed");




        driver.quit();
        System.out.println("-> Browser Closed");




    }
}
