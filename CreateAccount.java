package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Abcd");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='Annual Revenue']/following::input[@id='annualRevenue']")).sendKeys("454545");
		WebElement industryDropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryEnumDropdown=new Select(industryDropdown);
		industryEnumDropdown.selectByValue("IND_SOFTWARE");
		WebElement ownershipDropdown = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipEnumDropdown=new Select(ownershipDropdown);
		ownershipEnumDropdown.selectByVisibleText("S-Corporation");
		WebElement sourceDropdown = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select dataSourceDropdown=new Select(sourceDropdown);
		dataSourceDropdown.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingDropdown = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketingcampignDropdown=new Select(marketingDropdown);
		marketingcampignDropdown.selectByIndex(6);
		WebElement stateProvinceDropdown = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateDropdown=new Select(stateProvinceDropdown);
		stateDropdown.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.out.println("Successfully created Account");
		
		
		
	}

}
