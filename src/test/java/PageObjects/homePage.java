package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	  WebDriver driver;
	 
	  
	    // Locators for homepage elements
	    WebElement  createAccountLink = driver.findElement(By.linkText("Create an Account"));
	    WebElement Singin=driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));

	    public  homePage(WebDriver driver) {
	        this.driver = driver;
	    }
	    // Method to click on 'Create an Account' link
	    public void clickCreateAccount() {
	    	createAccountLink.click();
}
	    // click on sign in 
	    public void clickSignIn() {
	    	Singin.click();
	    }
}
