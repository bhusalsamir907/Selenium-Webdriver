package Headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {
    public static void main(String [] args){

        HtmlUnitDriver driver = new HtmlUnitDriver();
        System.out.println("<------------Headless Browser Testing in Selenium Java------------->");
        System.out.println("-> Headless Browser is Opened");

        driver.get("https://www.nopcommerce.com/");
        System.out.println("-> Routed to the Website");

        System.out.println("Title of Page : "+driver.getTitle());
        System.out.println("Current URL of the Page : "+driver.getCurrentUrl());
    }
}
