package org.example.BaseTest;

import org.example.Pages.Dashboard_POM;
import org.example.Pages.LoginPage_POM;
import org.openqa.selenium.WebDriver;

public class BaseTest { //to make common shared driver across hooks and stepdef

    public static WebDriver driver;
    public LoginPage_POM lp;
    public Dashboard_POM dp;
}
