package SeleniumProjects;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RouteBeforeLogin {

     public static void main(String [] args){
//ChromeBrowser
// Routing without Login in JPetStore
         System.setProperty("webdriver.chrome.driver","D:\\Broadway Infosis QA\\chromedriver_win32\\chromedriver.exe");

         WebDriver driver = new ChromeDriver(); //invokes or open the chrome browser
         System.out.println("\n<----------------Routing without Login in JPetStore------------->");
         System.out.println("1. Chrome Browser is Opened");
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//         Thread.sleep(4000);

         driver.manage().window().maximize(); //maximize the windows size
         System.out.println("2. Windows is Maximized");

         driver.get("https://petstore.octoperf.com/");
         System.out.println("3. Routed to JpetStore");

         driver.findElement(By.xpath("/html/body/div/p[1]/a")).click();
         System.out.println("4. Clicked on 'Enter the Store' ");

         System.out.println("5. User is on the Home Page of JpetStore");

         driver.findElement(By.xpath("//img[@src='../images/logo-topbar.gif']")).click();
         System.out.println("6. Logo is Clicked and Routed to Default Page");

         System.out.println("\n<-------------- Routing using QuickLinks Div --------------->");
         driver.findElement(By.xpath("//div[@id='QuickLinks']//a[1]")).click();
         System.out.println("Inside 'Fish' Contents");

         driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
         System.out.println("Clicked on Fish Product ID : FI-SW-01 or Angelfish ");

         driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewItem=&itemId=EST-1']")).click();
         System.out.println("Entered into AngelFish Items List");

         driver. findElement(By.cssSelector("a[href='/actions/Catalog.action?viewItem=&itemId=EST-1']")).click();
         System.out.println("Clicked on Item ID : EST-1 of AngelFish.");
//         driver.findElement(By.cssSelector("div[id='BackLink'] a")).click();
//         Thread.sleep(4000);
         driver.navigate().back();
         System.out.println("User is back to AngelFish Items List");
//















//         xpath=//div[@id='LogoContent']/a/img

//         driver.quit();
//         System.out.println("6. Browser is closed");

     }


}
