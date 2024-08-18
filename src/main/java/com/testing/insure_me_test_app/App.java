package com.testing.insure_me_test_app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args ) throws InterruptedException
    {
//initialize the chrome driver
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
	 	WebDriver driver = new ChromeDriver(options);

	 	
	 	//open the web application
        driver.get("http://54.163.195.231:8082/contact.html");
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        //1. Locate and Enter Name
        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        name.sendKeys("Farhan");
	System.out.println(name);
        
        //2. Locate and Enter Contact
        WebElement contact = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        contact.sendKeys("123456789");
	System.out.println(contact);
        
        //3. Locate Email and Enter Email
        WebElement mail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        mail.sendKeys("abc@abc.com");
	System.out.println(mail);
        
        //4. Locate Message and Enter Message
        WebElement msg = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        msg.sendKeys("This is Farhan");
	System.out.println(msg);
        
        Thread.sleep(2000);
        
        //5. Locate Send Button and click to send the message.
        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        sendButton.click();
        Thread.sleep(2000);
        
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
                
        driver.quit();
        
    }
}
