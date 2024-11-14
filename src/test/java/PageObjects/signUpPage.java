package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	 WebDriver driver;

    // Constructor
    public void SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    
 // Locators for sign-up form elements
    WebElement firstNameField=driver.findElement(By.id("firstname"));
    WebElement lastNameField=driver.findElement(By.id("lastname"));
    WebElement emailField=driver.findElement(By.id("email_address"));
    WebElement passwordField=driver.findElement(By.id("password"));
    WebElement confirmPasswordField=driver.findElement(By.id("password"));
    WebElement signUpButton=driver.findElement(By.cssSelector("button[type='submit']"));

    // Method to enter details in the sign-up form
    public void enterDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);
    }

    // Method to submit the sign-up form
    public void submitForm() {
       
    	signUpButton.click();
}
}
