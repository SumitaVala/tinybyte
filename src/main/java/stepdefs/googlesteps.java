package stepdefs;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

import commonUtilities.seleniumHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesteps {

	ChromeDriver driver;
	
@Given("start my browser {string}")
public void start_my_browser(String url) {
    // Write code here that turns the phrase above into concrete actions
   driver=  seleniumHelper.startbrowser(url);
}

@When("I give {string} in google")
public void i_give_in_google(String searchKey) {
    // Write code here that turns the phrase above into concrete actions
seleniumHelper.putdata_text(driver, searchKey);
}

@Then("I should get linked in profile")
public void i_should_get_linked_in_profile(DataTable table) {


	driver.close();
}
}