package stepdefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.app.commons.GenericUtils;
import com.app.commons.PageUtils;
import com.app.pageobjects.ExeterSignInPage;

import io.cucumber.java.en.Given;

public class ExeterSignInPageStepDef {

//	private final WebDriver driver = PageUtils.getDriver();
	private final ExeterSignInPage exeterSignInPage = new ExeterSignInPage();
	private final String url = GenericUtils.AppFileReader().getProperty("Exeter_URL");

	@Given("User launches the exeter application")
	public void launches_exeter_app() {
		System.out.println("fsfdgfdg");
		PageUtils.openPage(url);
		System.out.println(PageUtils.getTitle());
		Assert.assertTrue(true);
	}

	@Given("User clicks on privacy policy hyperlink")
	public void clicks_privacy_policys() {
		Assert.assertTrue(true);
	}

}