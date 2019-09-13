package practcucu.paak;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class classs1 {
	WebDriver driver;
	@Given("the user launches the browser and opens the app")
	public void the_user_launches_the_browser_and_opens_the_app() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\download\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("the user enters the credentials")
	public void the_user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>>a=dataTable.asMaps();
		for(int i=0;i<a.size();i++)
		{
			String string=a.get(i).get("username");
			String string1=a.get(i).get("password");
			driver.findElement(By.id("userName")).sendKeys(string);
			driver.findElement(By.id("password")).sendKeys(string1);
			driver.findElement(By.xpath("//input[@type='reset']")).click();
			
		}
	    
	}

	@Then("the user clicks on login")
	public void the_user_clicks_on_login() {
		
	}
}
