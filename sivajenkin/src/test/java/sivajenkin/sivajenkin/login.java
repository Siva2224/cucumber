package sivajenkin.sivajenkin;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
	public static WebDriver driver;
	Actions action;
	
	@Given("launch chrome and load TestMeApp")
	public void launch_chrome_and_load_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://192.168.40.4:8083/TestMeApp1");
	  
	}

	@Given("navigate to signin")
	public void navigate_to_signin() {
		driver.findElement(By.xpath(".//a[contains(text(),\"SignIn\")]")).click();
	  
	}

	@Given("enter the username and password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("password"));
	  
	}

	@Then("click on login")
	public void click_on_login() {
		
		driver.findElement(By.name("Login")).click();
	    
	}

}
