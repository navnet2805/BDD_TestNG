package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Dashboard_POM;
import org.example.Pages.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class loginPage {

    WebDriver driver;
    LoginPage_POM lp;
    Dashboard_POM dp;

    @Given("User is on the OrangeHRM login page.")
    public void user_is_on_the_orange_hrm_login_page() {
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("user enters the valid {string} and {string}")
    public void user_enters_the_valid_username_and_password(String username,String password) {
        lp = new LoginPage_POM(driver);
        lp.enterusername(username);
        lp.enterpassword(password);
    }

    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        lp.clickLoginButton();
    }

    @Then("User should be redirected to the dashboard page.")
    public void user_should_be_redirected_to_the_dashboard_page() {
        dp = new Dashboard_POM(driver);
        Assert.assertTrue(dp.isPIMdisplayed());
    }

}
