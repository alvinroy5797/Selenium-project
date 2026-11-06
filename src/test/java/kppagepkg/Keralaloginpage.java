package kppagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keralaloginpage 
{
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath = "//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement logbtn;
	
	public Keralaloginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titleverification()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginmthd(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		logbtn.click();
	}

}
