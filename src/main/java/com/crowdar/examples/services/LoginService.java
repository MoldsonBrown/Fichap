package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class LoginService {
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility("LoginView.signInButton");
        Assert.assertTrue(MobileActionManager.isVisible("LoginView.signInButton"));
    }

    public static void FailedLoginProcess(String email, String password) {
        MobileActionManager.setInput("loginView.emailInput",email);
        MobileActionManager.setInput("loginView.passwordInput", password);
        MobileActionManager.click("loginView.signInButton");
    }

    public static void isModalMessageCorrect(String message) {
        Assert.assertEquals(MobileActionManager.getText("loginView.modalMessageText"), message);
    }


    public static void doLoginProcess(String email, String password) {
        MobileActionManager.setInput("loginView.emailInput",email);
        MobileActionManager.setInput("loginView.passwordInput", password);
        MobileActionManager.click("loginView.signInButton");
        MobileActionManager.click("loginView.acceptOpenCamButton");
        MobileActionManager.click("loginView.cameraButton");
    }

}
