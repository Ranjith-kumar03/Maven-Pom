package Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hook {
	
	private static WebDriver driver;
	
	@Before ("@web")
	
	public void PCconfig() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranji\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Stupid iam inside web capablities");
		
	}
	
	@Before ("@appium")	
	
	public void Mobile() throws MalformedURLException, InterruptedException
	{
		System.out.println("Stupid iam inside Mobile capablities");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "Ranjith");
		cap.setCapability("udid", "H1AXHM03E676X4Z");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		
		//App Information
		
		cap.setCapability("appPackage", "com.android.chrome");
		
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		//cap.setCapability("appActivity", "com.accuweather.core.CardViewPager");
		//cap.setCapability("appActivity", "com.amazon.mShop.android.home.PublicUrlActivity");
		//cap.setCapability("appActivity", "com.amazon.mShop.youraccount.YourAccountActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(20000);
	}
	
	
	@After
	
	public void Teardowb() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.quit();
	}
	
	public static WebDriver getdriver()
	{
		return driver;
	}

}
