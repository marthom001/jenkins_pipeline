import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
		
		public class SeleniumTest {
		
		public static void main(String[] args) {
		               
		System.setProperty("webdriver.gecko.driver","C:\\Users\\marvin.thomas\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		 
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
				
		// Navigate to URL
		driver.get("https://calibresys-redcarpet.silkroad.com/");
		// Wait For Page To Load
		// (The implicit wait allows time for the page to load before throwing exception) 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.id("VerLoginID")).sendKeys("marthom001@yahoo.com");
				
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Enter Password
		driver.findElement(By.id("VerPassword")).sendKeys("     ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on 'Sign In' button						 
		 driver.findElement(By.id("submitLoginButton")).click();		
		
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //Click on each Tab Title
		driver.findElement(By.xpath("//a[contains(text(),'Getting \nStarted')]")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Benefits')]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//Logout
		driver.findElement(By.xpath("//a[2]")).click();		
		
		//Close the browser.
		driver.quit();
		}
		
		 
	
}
