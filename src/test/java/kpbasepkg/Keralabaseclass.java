package kpbasepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import kppagepkg.Keralaloginpage;

public class Keralabaseclass 
{
	public static WebDriver driver;
	public Keralaloginpage kloginobj;
	
	@BeforeTest
	public void setup()
	{
	driver= new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objmthd()
	{
		kloginobj = new Keralaloginpage(driver);
	}
}
