package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class CredentialsService {
    public static void ChangePassword(String newPassword, String confirmNewPassword) {
        MobileActionManager.click("CredentialsView.menuButton");
        MobileActionManager.click("CredentialsView.passwordOption");
        MobileActionManager.setInput("CredentialsView.newPasswordInput", newPassword);
        MobileActionManager.setInput("CredentialsView.repeatPasswordInput", confirmNewPassword);
        MobileActionManager.click("CredentialsView.savePasswordButton");


    }

    public static void PasswordChanged() {
        MobileActionManager.click("CredentialsView.passChangedButton");


    }
}
