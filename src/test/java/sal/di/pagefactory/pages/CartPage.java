package sal.di.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sal.di.pagefactory.WebDriverFactory;

public class CartPage {
	//
	WebDriver driver;

	//
	public CartPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
	}


	//
	@FindBy(css = ".checkout_button")
	private WebElement btnCheckout;
	

	
	public void checkooutCart() {
		btnCheckout.click();
		
	}

}