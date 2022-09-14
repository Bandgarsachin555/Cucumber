package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataTablee extends BaseClass{

	
	@Given("user is on login page on fffff")
	public void user_is_on_login_page_on_fffff() {
		BaseClass.initialize();
	    
	}
	@When("enter uname and password")
	public void enter_uname_and_password(DataTable dataTable) {
		List<List<String>> ls=dataTable.asLists();
		
		Login q=new Login();
		q.Fname(ls.get(0).get(0));
		q.lname1(ls.get(0).get(1));
		
	}
	@Then("user will be on home page|")
	public void user_will_be_on_home_page() 
	{
		System.out.println(driver.getTitle());
	}

	
}
