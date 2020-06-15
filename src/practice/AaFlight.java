package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AaFlight {
	//aaa
	//aaa
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium-Jar/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@id='jq-flightStatus']")).click();
driver.findElement(By.id("flightStatusOriginAirport")).sendKeys("DFW");
driver.findElement(By.id("flightStatusDestinationAirport")).sendKeys("ord");
driver.findElement(By.xpath("//*[@id='flightStatusView.submit']")).click();
Thread.sleep(2000L);
WebElement table = driver.findElement(By.cssSelector("table[class='flightschedule']"));
int rowcount = table.findElements(By.cssSelector("tr[class='oneSegment']")).size();
int divider = table.findElements(By.cssSelector("tr[class='divider']")).size();
System.out.println(rowcount);
System.out.println(divider);

table.findElement(By.cssSelector("#resultsTableBody > tr:nth-child(1) > td.checkStatusLink.top-link > a.is-desktop")).click();

Thread.sleep(2000L);
WebElement Statustable = driver.findElement(By.cssSelector("#aa-content-frame > app-root-flight-status > app-flight-details > div:nth-child(1) > app-flight-card > table"));

String status = Statustable.findElement(By.cssSelector("#flightStatus0")).getText();
Thread.sleep(2000L);

System.out.println("Flight Status is : " +status);

String ExpectedFlightStatus = "In flight";

if (status.equals(ExpectedFlightStatus))
{
	System.out.println("Status is matching");
}
else
{
	System.out.println("Status is not matching");
}
}

}