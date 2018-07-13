package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Steps {


    RemoteWebDriver driver;

    @Given("Open Chrome and go to the BMW Brilliance homepage$")
    public void open_Chrome_and_go_to_the_BMW_Brilliance_homepage() throws Throwable
    {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "chrome");
        caps.setCapability("e34:token" , "19705d15-03b8-4f"); //babbage / adoring edison

        driver = new RemoteWebDriver(new URL("https://vm-106.element34.net/wd/hub"), caps);
        driver.get("http://www.bmw-brilliance.cn/cn/en/index.html");
        Assert.assertEquals("BMW Brilliance", driver.getTitle());
    }

    @When("^Click on the Careers link$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        driver.findElement(By.linkText("Careers")).click();

    }

    @Then("^Verify page title$")
    public void Reset_the_credential() throws Throwable
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Assert.assertEquals("BMW Brilliance：Working in BMW Brilliance", driver.getTitle());
    }

    @Then("^Close browser$")
    public void close_browser() throws Throwable
    {
        driver.quit();
    }
}