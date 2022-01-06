package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

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
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		WebElement accountName = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		accountName.sendKeys("Credit Limited Account");
		String accountNameValue = accountName.getAttribute("value");
		System.out.println(driver.findElement(By.xpath("//button[text()='Find Accounts']")).getAttribute("value"));
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		WebElement accountNameEdit = driver.findElement(By.xpath("//table[@class='fourColumnForm']//span[@class='tabletext']"));
		if(accountName == accountNameEdit)
		{
			System.out.println("Check passed,Both are same");
		}
		else
		{
			System.out.println("Check failed");
		}
		System.out.println(driver.findElement(By.xpath("//table[@class='fourColumnForm']//td[@class='tabletext']")).getText());
		System.out.println(driver.getTitle());

	}

}
