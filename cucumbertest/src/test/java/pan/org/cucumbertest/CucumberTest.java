package pan.org.cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber"})
public class CucumberTest {
   
}
