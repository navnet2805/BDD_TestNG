package org.example.Pages;

import org.example.BasePage.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonPage {

    public LoginPage_POM(WebDriver driver)
    {
        super(driver);
    }

    //locators
    private By txtUsername = By.xpath("//input[@name=\"username\"]");
    private By txtPassword = By.xpath("//input[@name=\"password\"]");
    private By btnlogin = By.xpath("//button[text()=' Login ']");


    //Actions
    public void loginfunctionality(String user,String pwd)
    {
        enterInput(txtUsername,user);
        enterInput(txtPassword,pwd);
        clickElement(btnlogin);
    }

    public void enterusername(String user)
    {
        enterInput(txtUsername,user);
    }

    public void enterpassword(String pwd)
    {
        enterInput(txtPassword,pwd);
    }

    public void clickLoginButton()
    {
        clickElement(btnlogin);
    }

    public String getCurrentTitle()
    {
        return title();
    }

}
