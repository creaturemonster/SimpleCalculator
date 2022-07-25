import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SimpleCalculatorDefinitions {
	
	 SimpleCalculator calculator;

     int firstInt;

     int secondInt;

     int answer;
	@Given("^I have a calculator open$")
	public void i_have_a_calculator_open() throws Throwable {
	    calculator=new SimpleCalculator();
	}

	@When("^I enter (\\d+) and (\\d+)$")
	public void i_enter_and(int arg1, int arg2) throws Throwable {
		  firstInt = arg1;
	      secondInt = arg2;
	}

	@When("^I select add$")
	public void i_select_add() throws Throwable {
	   answer=calculator.add(firstInt, secondInt);
	}

	@Then("^I get (\\d+)$")
	public void i_get(int expectedResult) throws Throwable {
		 Assert.assertEquals(expectedResult, answer);
	}
}
