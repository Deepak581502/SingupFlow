package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	 WebDriver driver;
	
	

    // Locators for login form elements
	WebElement emailField = driver.findElement(By.id("email"));
    WebElement passwordField =driver.findElement(By.id("pass"));
    WebElement loginButton =driver.findElement(By.id("send2"));
    WebElement errorMessage =driver.findElement(By.cssSelector(".error-msg"));
   
	 // Constructor
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }


    // Method to enter login credentials
    public void enterCredentials(String email, String password) {
             emailField.sendKeys(email);
            passwordField.sendKeys(password);
    }

    // Method to submit the login form
    public void submitLogin() {
        
    	loginButton.click();
    }
    // Method to check if the error message is displayed
    public boolean isErrorMessageDisplayed() {
        try {
            
            return errorMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
