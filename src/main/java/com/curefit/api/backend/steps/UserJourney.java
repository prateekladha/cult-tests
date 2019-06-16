package com.curefit.api.backend.steps;

import com.curefit.api.backend.pages.Cult;
import com.curefit.api.backend.pages.Login;
import com.curefit.api.backend.pages.Pack;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserJourney {

    Login login;
    Cult cult;
    Pack pack;

    public UserJourney() {
        login = new Login();
        cult = new Cult();
        pack = new Pack();
    }

    @When("User log in using (.+) and (.+)")
    public void login(String emailAddress, String password) {
        login.auth(emailAddress, password);
    }

    @When("User went to cult page")
    public void user_went_to_cult_page() {
        cult.navigate();
    }

    @Then("User selects pack (.+), subscription start date (.+) and creates order")
    public void user_selects_pack_and_creates_order(int packId, String startDate) {
        pack.selectPack(packId, startDate);
    }
}
