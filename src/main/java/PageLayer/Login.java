package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Login extends BaseClass{

	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="reg_email__")
	WebElement Email;
	
	@FindBy(name="reg_passwd__")
	WebElement pass;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Fname(String fname1)
	{
		fname.sendKeys(fname1);
	}
	public void lname1(String lnam)
	{
		lname.sendKeys(lnam);
	}
	public void Email1(String Emai)
	{
		Email.sendKeys(Emai);
	}
	public void pass1(String pass1)
	{
		pass.sendKeys(pass1);
	}
	
}
