package org.example.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {
    public WebDriver driver;

    public CommonPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterInput(By by, String user)
    {
        driver.findElement(by).sendKeys(user);
    }

    public void clickElement(By by)
    {
        driver.findElement(by).click();
    }

    public String getText(By by)
    {
        return driver.findElement(by).getText();
    }

    public boolean isDisplayed(By by)
    {
        return driver.findElement(by).isDisplayed();
    }

    public String title()
    {
        return driver.getTitle();
    }

}
