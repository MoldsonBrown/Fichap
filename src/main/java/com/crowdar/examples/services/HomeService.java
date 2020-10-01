package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class HomeService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility("HomeView.startButton");
        Assert.assertTrue(MobileActionManager.isVisible("HomeView.startButton"));
    }

    public static void doLoginProcess(String email, String password){
        MobileActionManager.setInput("HomeView.emailInput",email);
        MobileActionManager.setInput("HomeView.passwordInput", password);
        MobileActionManager.click("HomeView.signInButton");
        MobileActionManager.click("HomeView.acceptOpenCamButton");
        MobileActionManager.click("HomeView.cameraButton");
    }

    public static void TapsOnCheckInButton() {
        MobileActionManager.click("HomeView.checkInButton");
        MobileActionManager.click("HomeView.cameraButton");
        MobileActionManager.waitVisibility("HomeView.errorReportButton");
        MobileActionManager.click("HomeView.errorReportButton");
        MobileActionManager.click("HomeView.modalStartButton");
    }

    public static void isCheckOutButtonLoaded() {
        MobileActionManager.waitVisibility("HomeView.checkOutButton");
        Assert.assertTrue(MobileActionManager.isVisible("HomeView.checkOutButton"));

    }

    public static void TapsOnCheckOutButton() {
        MobileActionManager.click("HomeView.checkOutButton");
        MobileActionManager.click("HomeView.modalFinishButton");
    }

    public static void TapsOnFinishButton() {
        MobileActionManager.click("HomeView.finishButton");
    }

    public static void isTimeButtonLoaded() {
        MobileActionManager.waitVisibility("HomeView.timeButton");
        Assert.assertTrue(MobileActionManager.isVisible("HomeView.timeButton"));
    }
}