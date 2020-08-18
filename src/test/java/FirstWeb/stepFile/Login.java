package FirstWeb.stepFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;

	// import cucumber for @Before when shows red line.
	@Before
	public void setup() {
		// If resources link value comes with single "/", make it double"//".
		System.setProperty("webdriver.chrome.driver",
				"/home/akondshaheen/Desktop/Programming2/project/Cucumber selenium/target/test-classes/FirstWeb/Resources/chromedriver.exe");
		// select actual driver object to chromedriver.
		this.driver = new ChromeDriver();
		// maximize window.
		this.driver.manage().window().maximize();
		// mention pageload time.
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

	}

	// import cucumber api
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		this.driver.manage().deleteAllCookies();
		// this.driver.quit();
		this.driver = null;

	}

	@Given("^User navigate to the website\\.$")
	public void user_navigate_to_the_website() throws Throwable {
		driver.get("http://www.haute-garonne.gouv.fr/booking/create/7736");
	}

	@And("^User click on the check box$")
	public void User_click_on_the_check_box() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// *[@id="condition"]
		driver.findElement(By.xpath("//*[@id=\"condition\"]")).click();

	}

	@And("^User click on continue button on homepage$")
	public void user_click_on_continue_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/input[1]")).click();
	}

	@And("^User select an option$")
	public void user_select_an_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"planning14500\"]")).click();

	}

	@When("^User click on continue$")
	public void user_click_on_contitnue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	@Then("^User click on close if no dates$")
	public void user_click_on_cloe_if_no_dates() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	// second phase.
	@And("^UserTwo click on the check box$")
	public void UserTwo_click_on_the_check_box() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// *[@id="condition"]
		driver.findElement(By.xpath("//*[@id=\"condition\"]")).click();

	}

	@And("^UserTwo click on continue button on homepage$")
	public void userTwo_click_on_continue_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/input[1]")).click();
	}

	@And("^UserTwo select an option$")
	public void userTwo_select_an_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"planning14510\"]")).click();

	}

	@When("^UserTwo click on continue$")
	public void userTwo_click_on_contitnue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	@Then("^UserTwo click on close if no dates$")
	public void userTwo_click_on_cloe_if_no_dates() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	// Third phase.
	@And("^UserThree click on the check box$")
	public void UserThree_click_on_the_check_box() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// *[@id="condition"]
		driver.findElement(By.xpath("//*[@id=\"condition\"]")).click();

	}

	@And("^UserThree click on continue button on homepage$")
	public void UserThree_click_on_continue_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/input[1]")).click();
	}

	@And("^UserThree select an option$")
	public void UserThree_select_an_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"planning14520\"]")).click();

	}

	@When("^UserThree click on continue$")
	public void UserThree_click_on_contitnue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	@Then("^UserThree click on close if no dates$")
	public void UserThree_click_on_cloe_if_no_dates() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	// Fourth phase.
	@And("^UserFour click on the check box$")
	public void UserFour_click_on_the_check_box() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// *[@id="condition"]
		driver.findElement(By.xpath("//*[@id=\"condition\"]")).click();

	}

	@And("^UserFour click on continue button on homepage$")
	public void UserFour_click_on_continue_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/input[1]")).click();
	}

	@And("^UserFour select an option$")
	public void UserFour_select_an_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"planning14520\"]")).click();

	}

	@When("^UserFour click on continue$")
	public void UserFour_click_on_contitnue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	@Then("^UserFour click on close if no dates$")
	public void UserFour_click_on_cloe_if_no_dates() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	// Fifth phase.
	@And("^UserFive click on the check box$")
	public void UserFive_click_on_the_check_box() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// *[@id="condition"]
		driver.findElement(By.xpath("//*[@id=\"condition\"]")).click();

	}

	@And("^UserFive click on continue button on homepage$")
	public void UserFive_click_on_continue_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div[2]/input[1]")).click();
	}

	@And("^UserFive select an option$")
	public void UserFive_select_an_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"planning14520\"]")).click();

	}

	@When("^UserFive click on continue$")
	public void UserFive_click_on_contitnue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}

	@Then("^UserFive click on close if no dates$")
	public void UserFiver_click_on_cloe_if_no_dates() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/form/div/input")).click();

	}
}
