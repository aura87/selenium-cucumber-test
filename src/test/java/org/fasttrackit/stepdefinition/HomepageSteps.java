package org.fasttrackit.stepdefinition;

import cucumber.api.java.en.Given;
import org.fasttrackit.TesteBase;

public class HomepageSteps extends TesteBase {

    @Given("^I open the homepage$")
    public void iOpenTheHomepage() {
        openHomepage();

    }
}
