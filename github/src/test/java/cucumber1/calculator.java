package cucumber1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calculator{
	@Given("i entered number 50 in calculator")
	public void i_entered_number_50_in_calculator () {
		System.out.println("i entred number 50 in calculator");
		
	}
	@And("i press add")
	public void i_press_add() {
		System.out.println("i press add");
	}
	
	@And("i have entred number 50 in calculator")
	public void i_have_entred_number_50_in_calculator() {
		System.out.println("i have entred number 50 in calculator");
	}
	
	@When("i press equal")
	public void i_press_equal() {
		System.out.println("i press equal");
	}
	
	
	
	
	
	@Then("result 100 should be display")
	public void result_100_should_be_display() {
		System.out.println("result 100 should be display");
	}
}