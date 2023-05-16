package com.saucedemo;

import com.cucumber.listener.Reporter;
import com.saucedemo.cucumber.browserfactory.ManageBrowser;
import com.saucedemo.cucumber.propertyreader.PropertyReader;
import com.saucedemo.cucumber.utility.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utilities {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
        @After
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()){
                String screeShotPath = Utilities.getScreenshot(ManageBrowser.driver, scenario.getName().replace(" ", "_"));
                try {
                    Reporter.addScreenCaptureFromPath(screeShotPath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            closeBrowser();
    }
}
