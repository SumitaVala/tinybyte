package stepdefs;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class secondstepdef {


@Given("I want to write a step with {string}")
public void i_want_to_write_a_step_with(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("data present in  Given " + string);
} 
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    System.out.println("data present in  when " + int1);
	}
	
	
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("data present in  @Then " + string);
	}

	@Then("I verify {int} and {string} both in steps")
	public void i_verify_and_both_in_steps(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("data present in  @Then string =" + string + ", value=" + int1);
		
		//Assert.assertEquals(true, false);
		
		Assert.assertEquals(string, "Success" );
		
	}
	
	@Then("I verify the blow values in step")
	public void i_verify_the_blow_values_in_step(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List <String> lst =dataTable.asList();
		
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2)); 
		
		
		
		
	}

}
