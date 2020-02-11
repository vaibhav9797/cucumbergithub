package cucumber1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin=("json:src/test/java/cucumber1/ouput.json")
		)


public class calculatorrunner{
	
}