package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB extends BaseClass{

	@Given("FB url")
	public void fb_url() {
	  System.out.println("FB background");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		 BaseClass.initialize();
	}
	@When("user enter {string}, {string}, {string} and {string}")
	public void user_enter_and(String string1, String string2, String string3, String string4) {
		Login l=new Login();
				
		l.Fname(string1);
		l.lname1(string2);
		l.Email1(string3);
		l.pass1(string4);
	}
	@Then("user is on Home page")
	public void user_is_on_home_page() throws InterruptedException {
		Thread.sleep(5000);
		String f=driver.getTitle();
		System.out.println(f);
	}
}
