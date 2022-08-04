package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {
    public static void main(String [] args){
        System.setProperty("webdriver.gecko.driver","D:\\Broadway Infosis QA\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("<------------Get Methods Practice------------->");
        System.out.println("-> Firefox Browser is Opened");

        driver.manage().window().maximize();
        System.out.println("-> Windows is Maximized");

        driver.get("https://www.facebook.com/");
        System.out.println("-> Routed to the Website");

        System.out.println("Title of the Website : "+driver.getTitle());
        System.out.println("Current URL : "+driver.getCurrentUrl());

        String txt = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText();
        System.out.println("Text of the Element : "+txt);



        driver.quit(); //closes entire browser
        // driver.close(); //closes only current window of the browser
        System.out.println("-> Browser is Closed");


    }

}
