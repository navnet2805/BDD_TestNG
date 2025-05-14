package org.example.stepDefinitions;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BaseTest.BaseTest;
import org.example.Pages.Dashboard_POM;
import org.example.Pages.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class loginPage extends BaseTest {

    WebDriver driver = super.driver;

    @Given("user should be in OrangeHRM login page")
    public void user_should_be_in_orange_hrm_login_page() {
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @When("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String user,String pwd) {
        lp = new LoginPage_POM(driver);
        lp.enterusername(user);
        lp.enterpassword(pwd);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        lp.clickLoginButton();
    }


    @Then("Verify user is navigated to Dashboard page")
    public void verify_user_is_navigated_to_dashboard_page() {
        dp = new Dashboard_POM(driver);
        Assert.assertTrue(dp.isPIMdisplayed());
    }

    @When("user enters invalid username and invalid password")
    public void user_enters_invalid_username_and_invalid_password() {
        lp = new LoginPage_POM(driver);
        lp.enterusername("admin01");
        lp.enterpassword("Kacker@4321");
    }
    @Then("Verify user is not navigated to Dashboard page")
    public void verify_user_is_not_navigated_to_dashboard_page() {
        dp = new Dashboard_POM(driver);
        Assert.assertFalse(dp.isPIMdisplayed());
    }


}
