import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fileprop {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/GU20463639/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriver driver1=new ChromeDriver();
		 driver1.navigate().to("https://login.salesforce.com/");
		 Thread.sleep(5000);
    FileInputStream fis=null;
    Properties prop=new Properties();
    fis=new FileInputStream("/Users/GU20463639/eclipse-workspace/Selenium/text.properties");
    prop.load(fis);
    
     System.out.println(prop.getProperty("name"));
     System.out.println(prop.getProperty("url"));
 	WebElement uname=driver1.findElement(By.xpath("//*[@id=\"username\"]"));
	uname.sendKeys(prop.getProperty("name"));
	 Thread.sleep(5000);
	WebElement pw=driver1.findElement(By.xpath("//*[@id=\"password\"]"));
	pw.sendKeys(prop.getProperty("password"));
	 Thread.sleep(5000);
	 
	 driver1.close();

}
}
