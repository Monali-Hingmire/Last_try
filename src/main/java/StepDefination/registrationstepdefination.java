package StepDefination;

import Allpages.Registrationpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registrationstepdefination extends Registrationpage{
	@Given("user should be login")
	public static void user_should_be_login()
	{
		browserInitialization();
	}
	@Then ("clicks on submit")
	public static void clicks_on_submit()
	{
		clicklogin();
	}
	@When("^user enters Valid mltipleusernames\"([^\"]*)\"$")
	public static void user_enters_Valid_mltipleusernames(String multipleusername)
	{
		enteremailid(multipleusername);
	}
	@And("^User enters valid multiplepasswords\"([^\"]*)\"$")
	public static void User_enters_valid_multiplepasswords(String multiplepassowrddd)
	{
		enterpassword(multiplepassowrddd);
	}
	

}
