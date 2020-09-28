package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class HomeService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility("HomeView.startButton");
        Assert.assertTrue(MobileActionManager.isVisible("HomeView.startButton"));
    }
}