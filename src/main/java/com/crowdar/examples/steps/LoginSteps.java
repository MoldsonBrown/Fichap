package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("The fichap app is loaded correctly")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user does login process with '(.*)' and '(.*)'")
    public void doLoginProcess(String email, String password) {
        LoginService.doLoginProcess(email, password);
    }

    @Then("The modal message is '(.*)'")
    public void isModalMessageCorrect(String message) {
        LoginService.isModalMessageCorrect(message);

    }
}