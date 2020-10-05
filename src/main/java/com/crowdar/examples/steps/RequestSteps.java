package com.crowdar.examples.steps;

import com.crowdar.examples.services.RequestService;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RequestSteps {
    @When("The user creates a new request with date and '(.*)'")
    public void CreateNewRequest(String reason) {RequestService.CreateNewRequest(reason);}

    @Then("The confirmation message is '(.*)'")
    public void NewRequestConfirmation(String message) {RequestService.NewRequestConfirmation(message);}
}
