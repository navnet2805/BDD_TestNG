package org.example.Pages;

import org.example.BasePage.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard_POM extends CommonPage {

    public Dashboard_POM(WebDriver driver)
    {
        super(driver);
    }

    //locators
    private By PIMword = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    //action
    public boolean isPIMdisplayed()
    {
        return isDisplayed(PIMword);
    }

}
