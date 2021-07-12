package eReport;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com");
		
		String ExpectedText="PracticeAutomationHere";
		
		String ActualText=driver.findElement(By.id("pah")).getText();
		
		if(ActualText.equals(ExpectedText)) {
			System.out.println("okay");
			
		}else {
			System.out.println("no");
		}
		
	}	
}
