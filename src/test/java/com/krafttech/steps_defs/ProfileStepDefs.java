package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.OverviewPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class ProfileStepDefs {


    @When("User should go to my profile with {string}")
    public void user_should_go_to_my_profile_with(String tabName) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(tabName,"My Profile");
        BrowserUtils.waitFor(3);

    }

    @When("User should navigate to {string}")
    public void user_should_navigate_to(String tabName) {
        OverviewPage overviewPage = new OverviewPage();
        overviewPage.tapOnTab(tabName);
        BrowserUtils.waitFor(3);
    }


}
