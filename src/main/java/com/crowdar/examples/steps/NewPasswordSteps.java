package com.crowdar.examples.steps;

import com.crowdar.examples.services.CredentialsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewPasswordSteps {
    @When("The user changes the password with '(.*)' and '(.*)'")
    public void ChangePassword(String newPassword, String confirmNewPassword) {
        CredentialsService.ChangePassword(newPassword,confirmNewPassword);}

    @Then("The password is successfully changed")
    public void PasswordChanged() {CredentialsService.PasswordChanged();}

 }
