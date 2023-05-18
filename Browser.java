import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/GU20463639/Downloads/chromedriver_mac_arm64/chromedriver");
	     WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/newtours/login.php/");
        Thread.sleep(5000);
        WebDriver sd=new SafariDriver();
        sd.navigate().to("https://demo.guru99.com/test/newtours/login.php/");
        Thread.sleep(5000);
        
        driver.close();
        sd.close();
        
	}

}
