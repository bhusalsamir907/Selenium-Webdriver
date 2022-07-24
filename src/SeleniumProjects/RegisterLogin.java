package SeleniumProjects;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLogin {
    public static void main (String[] args)
    {
        System.out.println("Automate Testing using Selenium Webdriver in Java");

        //Edge Browser
//        System.setProperty("webdriver.edge.driver", "D:\\Broadway Infosis QA\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver edgeDriver = new EdgeDriver();
//        edgeDriver.get("https://petstore.octoperf.com");



        //Chrome Browser
        System.setProperty("webdriver.chrome.driver","D:\\Broadway Infosis QA\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //invokes or opens the browser
        System.out.println("<-------------------Register and Login---------------------->");
        System.out.println("-> Chrome Browser is Opened");

        driver.manage().window().maximize(); //maximizes the windows size
        System.out.println("-> Windows is Maximized");
//        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);


        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        String baseUrl = "https://petstore.octoperf.com/";


// launch chrome and direct it to the Base URL
        driver.get(baseUrl); //routes to the given url
        System.out.println("-> Routed to JpetStore");
        //      driver.get("https://petstore.octoperf.com/");


        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        String expectedTitle = "JPetStore Demo";
        String actualTitle = driver.getTitle();
        System.out.println("-> Verifying the Title :");
        if (actualTitle.contentEquals(expectedTitle))
        {
            System.out.println("-->Test Passed!");
        }
        else
        {
            System.out.println("-->Test Failed!");
        }


//        driver.findElement(By.id("content.")).click();


        driver.findElement(By.xpath("//div[@id='Content']//a[@href='actions/Catalog.action']")).click();
        System.out.println("-> Clicked on 'Enter the Store' ");
        System.out.println("-> User is on the Home Page of JpetStore");

        driver.findElement(By.linkText("Sign In")).click();
        System.out.println("-> Clicked on the 'Sign In'");

        driver.findElement(By.xpath("//a[contains(@href, '/actions/Account.action?newAccountForm=')]")).click();
        System.out.println("-> Clicked on the 'Register Now!'");
        System.out.println("-> Enters the Registration Form ");

        System.out.println("<--------------User Informations---------------->");
//        Generate RAndom Username
        Random random = new Random();
        double db = (random.nextDouble());
        double roundoff=Math.round(db*1000);
        String userid ="samir"+roundoff;

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(userid);
        System.out.println("-> Enters the 'User ID' ");


        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(userid);
        System.out.println("-> Enters the 'New Password' ");

        driver.findElement(By.name("repeatedPassword")).clear();
        driver.findElement(By.name("repeatedPassword")).sendKeys(userid);
        System.out.println("-> Enters the 'Repeat Password' ");

        System.out.println("<----------User Account Information Form----------> ");

        driver.findElement(By.name("account.firstName")).sendKeys(userid);
        driver.findElement(By.name("account.lastName")).sendKeys("Bhusal");
        driver.findElement(By.name("account.email")).sendKeys("QA@ssamsir.com");
        driver.findElement(By.name("account.phone")).sendKeys("1234567890");
        driver.findElement(By.name("account.address1")).sendKeys("Gongobu");
        driver.findElement(By.name("account.address2")).sendKeys("Kathmandu");
        driver.findElement(By.name("account.city")).sendKeys("ktm");
        driver.findElement(By.name("account.state")).sendKeys("Bagmati");
        driver.findElement(By.name("account.zip")).sendKeys("44600");
        driver.findElement(By.name("account.country")).sendKeys("Nepal");
        System.out.println("-> Account Information is successfully entered! ");

        driver.findElement(By.name("newAccount")).click();
        System.out.println("-> Clicked on 'save Account Information' and User is registered! ");


        {
            driver.findElement(By.linkText("Sign In")).click();
            System.out.println("-> Clicked on the 'Sign In'");


//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("username")).sendKeys(userid);
            System.out.println("-> Entered the 'username' ");

//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(userid);
            System.out.println("-> Entered the 'Password' ");

            driver.findElement(By.name("signon")).click();
            System.out.println("-> Clicked on the Login button");
            System.out.println("-> Enter inside the Home Page as a Registered User");

//            driver.findElement(By.linkText("Sign Out")).click();
            System.out.println("Signed Out Successfully !!!");


        }














// Close the Browser
//       driver.quit();
        //or
      //  driver.close();







    }
}
