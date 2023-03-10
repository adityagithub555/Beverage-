package pomLiquids1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers1 {
	private WebDriver driver;

	@FindBy(xpath = "(//li[@class='nav-item d-flex dropdown dropdown-on-hover position-static']/a)[6]")
	private WebElement wines;

	@FindBy(xpath = "(//a[text()='Red Wine'])[2]")
	private WebElement redWine;

	@FindBy(xpath = "//h4[text()='AMARIS MERLOT ']")
	private WebElement amarisMerlot;

	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	private WebElement addToCart1;
	
	@FindBy(xpath ="(//button[text()='750ML'])[1]")
	private WebElement ml750;

	public Headers1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnHeaders() {
		
//		Actions act=new Actions(driver);
//		act.moveToElement(wines).click().build().perform();
		wines.click();
		redWine.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");
//		js.executeScript("arguments[0].scrollIntoView(true)",ml750);
		addToCart1.click();
	}

}
