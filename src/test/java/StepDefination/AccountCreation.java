package StepDefination;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation extends BaseClass {
    
	@Given("open all browser")
	public void open_all_browser() 
	{
	   System.out.println(" Account background keyword");
	}
	@Given("user in on loan account creation page")
	public void user_in_on_loan_account_creation_page() 
	{
System.out.println("scenario1, step1");
	}

	@When("enter customer details")
	public void enter_customer_details() {
		System.out.println("scenario1, step2");
	}

	@Then("account got creation")
	public void account_got_creation() 
	{
		System.out.println("scenario1, step3");
}
	@Given("add Customer name")
	public void add_customer_name() {
		System.out.println("scenario2, step1");
	}
	@When("account got created")
	public void account_got_created() {
		System.out.println("scenario2, step1");
	}

}
