package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {
    public static void main(String [] args){

        System.setProperty("webdriver.gecko.driver","D:\\Broadway Infosis QA\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("<-----------Conditional Commands Practice------------->");
        System.out.println("-> Firefox Browser is Opened");

        driver.manage().window().maximize();
        System.out.println("-> Windows is Maximized");


        driver.get("https://www.facebook.com/");
        System.out.println("-> Routed to the Website");

        WebElement email = driver.findElement(By.name("email"));
        WebElement passwrd = driver.findElement(By.name("pass"));

        System.out.println("-> WebElement Object as email and passwrd defined");


        if (email.isDisplayed() && email.isEnabled())
        {
            email.sendKeys("testing@selenium");
            System.out.println("--> 'email' is displayed and enabled");
        }

        if (passwrd.isDisplayed() && passwrd.isEnabled())
        {
            passwrd.sendKeys("testing");
            System.out.println("--> 'passwrd' is displayed and enabled");
        }


        driver.quit();
        System.out.println("-> Browser is Closed");



        
    }
}
