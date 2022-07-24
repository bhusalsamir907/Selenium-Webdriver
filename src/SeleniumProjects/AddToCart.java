package SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","D:\\Broadway Infosis QA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("<----------Adding to The Shopping Cart------------->");
        System.out.println("-> Browser is Opened");
        System.out.println("-> Windows is Maximized");

        driver.get("https://petstore.octoperf.com/");
        System.out.println("-> Routed to JpetStore");

        driver.findElement(By.xpath("/html/body/div/p[1]/a")).click();
        System.out.println("-> Clicked on 'Enter the Store' ");
        System.out.println("-> User is on the Home Page of JpetStore");

        driver.findElement(By.linkText("Sign In")).click();
        System.out.println("-> Clicked on the 'Sign In'");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("samir");
        System.out.println("-> Entered the 'username' ");


        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        System.out.println("-> Entered the 'Password' ");

        driver.findElement(By.name("signon")).click();
        System.out.println("-> Clicked on the Login button");
        System.out.println("-> Enter inside the Home Page as a Registered User");





//        driver.findElement(By.linkText("Sign Out")).click();
        System.out.println("Signed Out Successfully !!!");

//        driver.quit();
        System.out.println("Browser is closed");
    }
}
