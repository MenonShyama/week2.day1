package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Info");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shyama");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("menon");
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown=new Select(dd);
		dropdown.selectByVisibleText("Employee");
		WebElement marketDropdown = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketCampignDropdown=new Select(marketDropdown);
		marketCampignDropdown.selectByValue("9001");
		WebElement ownershipDropdown = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipEnumDropdown=new Select(ownershipDropdown);
		ownershipEnumDropdown.selectByIndex(5);
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select countryEnumDropdown=new Select(countryDropdown);
		countryEnumDropdown.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		

	}

}
