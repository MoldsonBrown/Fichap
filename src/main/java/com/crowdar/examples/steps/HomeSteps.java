package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends PageSteps {

    @Given("The user does login process with: '(.*)', '(.*)'")
    public void doLoginProcess(String email, String password) {
           HomeService.doLoginProcess(email, password);
    }

    @When("The user taps on CheckInButton")
    public void theUserTapsOnCheckInButton() {
        HomeService.TapsOnCheckInButton();
    }

    @And("The button CheckOutButton is displayed")
    public void theButtonCheckOutButtonIsDisplayed() {
        HomeService.isCheckOutButtonLoaded();
    }

    @And("The user taps on CheckOutButton")
    public void theUserTapsOnCheckOutButton() {
        HomeService.TapsOnCheckOutButton();
    }

    @And("The total time spent is displayed")
    public void theTotalTimeSpentIsDisplayed() {
        HomeService.isTimeButtonLoaded();
    }

    @And("The user taps on FinishButton")
    public void theUserTapsOnFinishButton() {
        HomeService.TapsOnFinishButton();
    }
    @Then("The Homepage is displayed")
    public void theHomepageIsDisplayed() {
        HomeService.isViewLoaded();
    }
}