package org.example.hooks;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.BaseTest.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

        @Before //executed before every scenario
    public void setup(Scenario scenario)
    {
        BaseTest.driver = new ChromeDriver();
    }

    @After //executed after every scenario
    public void teardown(Scenario scenario)
    {
        BaseTest.driver.quit();
        //takescreenshot code
    }

}
