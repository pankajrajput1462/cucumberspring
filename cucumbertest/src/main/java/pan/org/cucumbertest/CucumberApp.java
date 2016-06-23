package pan.org.cucumbertest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class CucumberApp {
	@Given("^the cow weighs (\\d+) kg$")
	public void the_cow_weighs_kg(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		throw new PendingException();
	}

	@When("^we calculate the feeding requirements$")
	public void we_calculate_the_feeding_requirements() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the energy should be (\\d+) MJ$")
	public void the_energy_should_be_MJ(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the protein should be (\\d+) kg$")
	public void the_protein_should_be_kg(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
