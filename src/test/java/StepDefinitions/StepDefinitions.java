package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.homePage;
import PageObjects.loginPage;
import PageObjects.signUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class StepDefinitions {
static	WebDriver driver;
  homePage HomePage;
  signUpPage SignUpPage;
  loginPage LoginPage;
 
	
	@Given("user on the home page")
	public void user_on_the_home_page() {
		WebDriverManager.chromedriver().setup();
		
	    driver= new ChromeDriver();
	    driver.get("https://magento.softwaretestingboard.com/");
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("User navigate to the sign-up page")
	public void user_navigate_to_the_sign_up_page() {
		
		HomePage= new homePage(driver);
		HomePage.clickCreateAccount();
		
	    
	}

	@Then("user fill out the sign-up form with valid details")
	public void user_fill_out_the_sign_up_form_with_valid_details() {
		//SignUpPage=new signUpPage(driver);
		SignUpPage.enterDetails("Deepak", "Kumar", "deepak15081998.ji@gmail.com", "Password123", "Password123");
		SignUpPage.submitForm();
		
	    
	}

	

	@Given("User on the login page")
	public void user_on_the_login_page() {
		LoginPage=new loginPage(driver);
		HomePage.clickSignIn();
		
		LoginPage.enterCredentials("deepak15081998.ji@gmail.com", "Password123");
		
	   
	}

	@When("User enter  registered email and password")
	public void user_enter_registered_email_and_password() {
	    
		HomePage=new homePage(driver);
		LoginPage.enterCredentials("deepak15081998.ji@gmail.com", "Password123");
	    
	}

	@Then("User should be logged in successfully and see my account page")
	public void user_should_be_logged_in_successfully_and_see_my_account_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		LoginPage = new loginPage(driver);
        Assert.assertTrue(LoginPage.isErrorMessageDisplayed());
	  
	}
}
