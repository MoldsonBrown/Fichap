package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class RequestService {
    public static void CreateNewRequest(String reason) {
        MobileActionManager.click("RequestView.menuButton");
        MobileActionManager.click("RequestView.requestsOption");
        MobileActionManager.click("RequestView.nextMonthArrow");
        MobileActionManager.click("RequestView.dateSelection");
        MobileActionManager.setInput("RequestView.reasonInput", reason);
        MobileActionManager.click("RequestView.sendRequestButton");
        MobileActionManager.click("RequestView.confirmRequestButton");
        }

    public static void NewRequestConfirmation(String message) {
        Assert.assertEquals(MobileActionManager.getText("RequestView.confirmationText"),message);
    }
}
