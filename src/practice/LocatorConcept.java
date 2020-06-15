package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorConcept {
	
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium-Jar/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
Thread.sleep(2000L);
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@id='jq-flightStatus']")).click();
driver.findElement(By.id("flightStatusOriginAirport")).sendKeys("DFW");
driver.findElement(By.id("flightStatusDestinationAirport")).sendKeys("ORD");
driver.findElement(By.xpath("//input[contains(@id, 'flightStatusView')]")).click();
//or
//driver.findElement(By.xpath("//input[@id='flightStatusView.submit']"));

//Technique for table grid

WebElement table=driver.findElement(By.cssSelector("table[class='flightschedule']"));
int rowcount = table.findElements(By.cssSelector("tr[class='oneSegment']")).size();
int dividercount = table.findElements(By.cssSelector("tr[class='divider']")).size();
System.out.println(rowcount);
System.out.println(dividercount);
Thread.sleep(2000L);
table.findElement(By.cssSelector("#resultsTableBody > tr:nth-child(1) > td.checkStatusLink.top-link > a.is-desktop")).click();
		
}
}