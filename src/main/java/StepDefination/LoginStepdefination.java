package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginpage;
import genericmethodP5.genericmethodC5;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefination extends loginpage{

	@Given("user should be login page")
	public static void user_should_be_login_page() throws IOException
	{
		browserInitialization();
		ExtentCucumberAdapter.addTestStepLog("Browser initilized successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginpage.takescreenshots(),"Browser screenprint");
	}
	@Then ("clicks on submit button")
	public static void clicks_on_submit_button() throws InterruptedException, IOException
	{
		Thread.sleep(7000);
		clicklogin();
		ExtentCucumberAdapter.addTestStepLog("user clicked log in button successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginpage.takescreenshots());
	}
	@When("user enters Valid username{string}")
	public static void user_enters_Valid_username(String username) throws IOException
	{
		enteremailid(username);
		ExtentCucumberAdapter.addTestStepLog("user is ab;e to enterded the username"+username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginpage.takescreenshots());
	}
	
	@And("User enters valid password{string}")
	public static void User_enters_valid_password(String passowrddd) throws IOException
	{
		enterpassword(passowrddd);
		ExtentCucumberAdapter.addTestStepLog("user is ab;e to enterded the password"+passowrddd);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginpage.takescreenshots());
	}
//	@Then("verify the error message")
//	public static void verify_the_error_message()
//	{
//		verify_errormessage("Find your account and log in.");
//		
//		
//	}
	
	
	@When("User enters Fname{string} Lname{string}")
	public void User_enters_Fname_Lname_Phone_email(String Fname , String Lname)
	{
		enterFirstname(Fname,Lname);
	}
	
	
	@And("User selects {string} from country dropdown using {string}")
	public void user_selects_country_from_dropdown_using(String country,
	String selectionType) throws InterruptedException {

	selectDropdown1(countryDropdown, selectionType, country);
	

	}
	
	@When("User selects radio button {string}")
	public void user_selects_radio_button(String option) {

		selectRadioButton(option);
	}

	@And ("User selects checkbox 1")
	public void user_selects_checkbox_1() {

		selectCheckbox1();
	}
	}



