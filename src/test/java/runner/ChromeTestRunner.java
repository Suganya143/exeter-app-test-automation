package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.app.commons.PageUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/main/resources/cucumber-reports/reports.html" }, features = {
		"src/test/resources/features" }, glue = { "stepdefinitions" })
public class ChromeTestRunner {
	
	@BeforeClass
	public static void browserInitialization() {
		System.out.println("check1");
		PageUtils.setUpDriver("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		PageUtils.tearDown();
	}
}
