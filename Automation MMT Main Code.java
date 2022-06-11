		// Things To Import 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

		//Main Program Starts From Here
public class MakeMyTripAuto {
public static void main(String[] args) throws InterruptedException {

		//Details To Locate Web Driver
System.setProperty("webdriver.chrome.driver", "D:\\\\SystemApplications\\\\ChromeWebDriver\\\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

		//To Get The URL Of The Website 
driver.get("https://www.makemytrip.com/railways/");

		//To Maximize The Window
driver.manage().window().maximize();

		//To Check The Correctnes Of Web Page
String URL = driver.getCurrentUrl();
if(URL.contains("https://www.makemytrip.com/railways/"))
{
System.out.println("The driver is in correct page");
}
else {
System.out.println("The driver is not in correct page");
}

		//To Print Title And URL Of The Page
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

 					//Codes To Select Various Options Starts From Here

		// For Clicking On The Button  To/Destination
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]")).click();
Thread.sleep(2000);

		//  For The Selection Of Destination
WebElement
searchBox2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"));
searchBox2.sendKeys("LKO");
Thread.sleep(2000);

		// To Click On The Selected Destination 
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div/ul/li[1]/div/div/p[1]/span")).click();
Thread.sleep(2000);

		//To Select Date . I Have Selected Another Date Because The date Given In Assignment Was Not Available On Website
driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Mon Jul 18 2022')]")).click(); 
Thread.sleep(2000);


		// To Click On Class
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[4]/label/span")).click();
Thread.sleep(2000);

		// To Select Third AC having code 3E
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[4]/ul/li[3]")).click();

		// To Click On Search Button
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a")).click();
}
}
