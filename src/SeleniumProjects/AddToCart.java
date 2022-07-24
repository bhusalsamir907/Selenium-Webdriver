package SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

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
        driver.findElement(By.name("username")).sendKeys("SamB");
        System.out.println("-> Entered the 'username' ");


        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        System.out.println("-> Entered the 'Password' ");

        driver.findElement(By.name("signon")).click();
        System.out.println("-> Clicked on the Login button");
        System.out.println("-> Enter inside the Home Page as a Registered User");

        System.out.println("<----------Adding One Time from each Product Category ------------>");

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
        System.out.println("---> Clicked on Fish placed on left 'Sidebar'");
        System.out.println("-> Inside the Fish Product Lists.");
        driver.findElement(By.linkText("FI-SW-01")).click();
        System.out.println("-> Clicked on Fish Product ID 'FI-SW-01'");
        System.out.println("-> Inside the Product ID 'FI-SW-01'.");
        driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(5) a:nth-child(1)")).click();
        System.out.println("-> Clicked on 'Add to Cart' of Item ID 'EST-1'.");
        System.out.println("-> Inserting the Quantity");


        driver.findElement(By.xpath("//input[@name='EST-1']")).clear();
        driver.findElement(By.xpath("//input[@name='EST-1']")).sendKeys("5");
        System.out.println("-> Inserted the Quantity");
        driver.findElement(By.cssSelector("input[value='Update Cart']")).click();
        System.out.println("-> Clicked on 'update Cart'");
        driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
        System.out.println("-> Clicked on 'Proceed to Checkout'");
        System.out.println("<-------User is in the 'Payment Details' and 'Billing Address' Form------>");
        System.out.println("--> Payment Details :");
        driver.findElement(By.name("order.cardType")).click();


// Using Select Class to select from simple dropdown menu :
        WebElement dropdown= driver.findElement(By.name("order.cardType"));
        Select select = new Select(dropdown);
//        select.deselectByVisibleText("MasterCard");
        select.selectByVisibleText("MasterCard");
        System.out.println("--> Clicked on the 'Card Type':");
        System.out.println("--> 'Mastercard  has been selected for payment.'");


//        driver.findElement(By.xpath("//input[@name='order.creditCard']")).sendKeys("999 9999 9999 9999");
        driver.findElement(By.xpath("//input[@name='newOrder']")).click();
        System.out.println("--> Clicked on the 'Continue'");
        System.out.println("--> User routed to confirmation page to verfiy the details.");

        driver.findElement(By.xpath("//a[normalize-space()='Confirm']")).click();
        System.out.println("--> Clicked on the 'Confirm'");
        System.out.println("--> Routed to order submission webpage");

//        verifying the order has been placed
        //Expected Message after order placement
        System.out.println("--> Verfiying the order Submitted or not :");

        String verifyMsg = "Thank you, your order has been submitted.";
        WebElement msg = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/ul[1]/li[1]"));
        String actaulMsg=msg.getText();

        if(actaulMsg.contentEquals(verifyMsg))
        {
            System.out.println("-->Order has been successfully Placed !!!");
        }
        else
        {
            System.out.println("--> Order Not placed !!!");
        }

        driver.findElement(By.tagName("img")).click();
        System.out.println("-> Routed to the Home page of the JpetStore");







//        driver.findElement(By.linkText("Sign Out")).click();
        System.out.println("Signed Out Successfully !!!");

//        driver.quit();
        System.out.println("Browser is closed");
    }
}
