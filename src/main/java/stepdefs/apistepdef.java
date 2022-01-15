package stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;

import commonUtilities.FileHelper;
import commonUtilities.propertyfileutil;
import commonUtilities.rest_api_helper;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import launcher.cucumberlauncher;

public class apistepdef {
public static void main(String[] args) throws Exception {
	i_access_REST_API_with_url_as("","https://$$DOMAIN_NAME$$/api/v1/Activities/4");
	System.out.println("");
	
	i_access_REST_API_with_url_as_and_data_from("", "https://$$DOMAIN_NAME$$/api/v1/Authors", "Author.json");
	
	
}

@Given("My API Server is up and Running")
public void my_API_Server_is_up_and_Running() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Inside given method");
}

@When("i access {string} REST API with url as {string}")
public static void i_access_REST_API_with_url_as(String string, String rawurl) throws FileNotFoundException, IOException {
    // Write code here that turns the phrase above into concrete actions
	
	//String domainname = propertyfileutil.getinstance().getproperty("app.domain");
	
	  String domainname = propertyfileutil.getinstance().getproperty("app.domain");
	String finalurl = rawurl.replace("$$DOMAIN_NAME$$", domainname);
	rest_api_helper.rest_getAPI(finalurl, false);
    System.out.println("Inside when method");
}

@Then("it should give me {string} response")
public void it_should_give_me_response(String expectedcode) {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println(expectedcode+">>>>>>>>>>>>Inside then method response code = "+rest_api_helper.get_responsecode);
	//assertNotEquals(expectedcode, String.valueOf(rest_api_helper.get_responsecode));
	
	assertEquals("message", expectedcode, String.valueOf(rest_api_helper.get_responsecode));
	//Assert.assertEquals(Integer.valueOf(expectedcode) , rest_api_helper.get_responsecode);
   
}
@Then("response should contain below value")
public void response_should_contain_below_value(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    System.out.println("Inside then method response code = "+rest_api_helper.get_responsemsg);

    System.out.println("inside verification");
}
@When("i access {string} REST API with url as {string} and data from {string}")
public static void i_access_REST_API_with_url_as_and_data_from(String string, String rawurl, String filename) throws Exception {

	String filepath = System.getProperty("user.dir")+"/src/test/resources/artifacts/"+filename;
	
	String data = FileHelper.getFiledata_as_string(filepath);
			
	
	 String domainname = propertyfileutil.getinstance().getproperty("app.domain");
	 String finalurl = rawurl.replace("$$DOMAIN_NAME$$", domainname);
		
	
	rest_api_helper.reset_postAPI_string(finalurl, data, false);	
	
	
}

@When("i access {string} REST API with url as {string} and data from {string} to update the record")
	public void i_access_REST_API_with_url_as_and_data_from_to_update_the_record(String string, String rawurl, String filename) throws Exception {
	
	String filepath = System.getProperty("user.dir")+"/src/test/resources/artifacts/"+filename;
	
	String data = FileHelper.getFiledata_as_string(filepath);
	
	 String domainname = propertyfileutil.getinstance().getproperty("app.domain");
	 String finalurl = rawurl.replace("$$DOMAIN_NAME$$", domainname);
	
	 System.out.println("rawurl"+finalurl+">>>>>>>>>>>>>>>>finaldata"+data);
		
		
	rest_api_helper.rest_putAPI_string(finalurl, data, false);
	

	
	 System.out.println(" ");
	}

@Then("response should get contain below value")
public void response_should_get_contain_below_value() {
   
	}

@When("i DELETE Record REST API with url as {string}")
public void i_DELETE_Record_REST_API_with_url_as(String rawurl) throws FileNotFoundException, IOException {
    // Write code here that turns the phrase above into concrete actions
	 String domainname = propertyfileutil.getinstance().getproperty("app.domain");
		String finalurl = rawurl.replace("$$DOMAIN_NAME$$", domainname);
		rest_api_helper.rest_deleteAPI_string(finalurl, false);
	    System.out.println("Inside when method record deleted");
	
}


public static void afterAllstepsexecution() {
	  String filepath = System.getProperty("user.dir") +"/test-output/HtmlReport/ExtentHtml.html";
	  cucumberlauncher.sendEmail("sumitavala.online@gmail.com","sumitavala.online@gmail.com",filepath, "sumitavala.online@gmail.com","Pune@123");
	System.out.println("************************Inside After test*****************************************************");
}
}
