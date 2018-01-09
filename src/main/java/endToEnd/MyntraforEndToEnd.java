package endToEnd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MyntraforEndToEnd{

	public ChromeDriver driver;

	public void StartBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-caret sprites-caret']")).click();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.findElement(By.name("email")).sendKeys("dimplesingh00786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("myntra");
		driver.findElementByXPath("//button[text()='Log in']").click();

		WebElement element = driver.findElement(By.cssSelector(".desktop-navLinks>div:nth-child(1)"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.cssSelector(".desktop-paneContent [href='/men-tshirts?src=tNav']")).click();
		driver.findElement(By.cssSelector(".results-base>li:nth-child(2)")).click();

		driver.findElement(By.cssSelector(".size-buttons-size-buttons>button:nth-child(3)")).click();
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();

		driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']").click();
		driver.findElementByXPath("//button[text()='PLACE ORDER']").click();
		driver.findElementByXPath(".items .address-row").click();
		driver.findElementByXPath("//button[text()='CONTINUE TO PAYMENT']").click();
		driver.findElementByXPath("//li[@id='tab_cod']/span[text()=' select ']").click();

		driver.quit();
	}

}
//
// public void countinueShopping() {
// clickByXpath("//a[text()='Continue Shopping ']");
//
// }
