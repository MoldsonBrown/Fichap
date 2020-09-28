package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.Then;

public class HomeSteps extends PageSteps {

    @Then("The Homepage is displayed")
    public void theHomepageIsDisplayed() {
        HomeService.isViewLoaded();
    }
}
