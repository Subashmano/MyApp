package com.application.pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class HomePageObjects extends BasePage {
//driver.findelements(By.id=)
    @FindBy(xpath="//*[text()='Women']")
	public WebElement womens;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;
	@FindBy(xpath="//*/*[3]/*[text()='T-shirts']")
	private WebElement tshirts;
	@FindBy(xpath="//*[text()='S']")
	private WebElement ssize;
	@FindBy(xpath="//*[text()='M']")
	private WebElement msize;
	@FindBy(xpath="//*[text()='L']")
	private WebElement lsize;
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement letter;
	@FindBy(xpath="//*[@name='submitNewsletter']")
	private WebElement letterclick;
	@FindBy(xpath="//*[@id='columns']/p")
	private WebElement alert;
    @FindBy(xpath="//*[@id='center_column']/h1/span[2]")
    private WebElement count;
    @FindBys(@FindBy(xpath="//*[@id='center_column']/ul/li"))
    private List<WebElement>count1;
    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement printed;
    @FindBy(xpath="//*[text()='$26.00']")
    private WebElement dollar;
    @FindBy(xpath="//*[text()='Add to cart']")
    private WebElement addcart;
    @FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a")
    private WebElement addcartproduct;
    @FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/span")
    private WebElement addcartdollar;
    @FindBy(xpath="//*[@title='Proceed to checkout']")
    private WebElement window;
    @FindBy (xpath="//*[@id='cart_title']/span")
    private WebElement producttext;
    
	
   public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	/*public WebElement gettxtwomens() {
	return womens;
	}
*/	public WebElement gettxtdresses() {
	return dresses;
	}
	public WebElement gettxttshirts() {
	return tshirts;
	}
	public WebElement getSsize() {
	ssize.getText();
	return ssize;
	}
	public WebElement getMsize() {
	msize.getText();
	return msize;
	}
	public WebElement getLsize() {
	lsize.getText();
	return lsize;
	}
	public WebElement getletter() {
	return letter;
	}
	public WebElement getclick() {
	return letterclick;
	}
	public WebElement getalertdanger() {
	return alert;
	}
	public WebElement getcount() {
	return count;
	}
	public List<WebElement> getcount1(){
    count1.size();
	return count1;
	}
	public WebElement getPrinted() {
	return printed;
	}
	public WebElement getaddcart() {
	return addcart;
	}
	
	public WebElement getdollar() {
	dollar.getText();
    return dollar;
	}
	public WebElement getaddcartdollar() {
    addcartdollar.getText();
	return addcartdollar;
	}
	// public WebElement getproducttext() {
		// return producttext;
	 //}
	
	/*public void displayes() {
		dressesclick();
		elementFound(getSsize());
		elementFound(getMsize());
		elementFound(getLsize());
	}*/
	
/*public WebElement displayes() {
elementFound(womens);
elementFound(dresses);
elementFound(tshirts);*/
//}
    public String womensclick() {
	womens.click();
	return getTitlte();
    }
	public String dressesclick() {
	dresses.click();
	return getTitlte();
	}
	public String tshirtsclick() {
	tshirts.click();
	return getTitlte();
    }
	public void newsletter() {
	letter.sendKeys("subash.smart10@gmail.com");
	//setText(letter, "subash.smart6@gmail.com");	
	}
	/*public String sub() {
	count.getText().substring(10);
	return sub();
	}*/
	public int countmatch() {
	String actual=getcount().getText().substring(10, 11);
	int num=Integer.parseInt(actual);
   //n getcount1().equals(num);	
	return num;
	}
	/*public void checkalert() {
	alert.getText();	
	}*/
	public String performaddcart() {
    getPrinted().click();
		//getdollar();
	getaddcart().click();
	window.click();
	String product=producttext.getText();
	return product;
		
	}
}
   
	

	
	
	






