package org.fasttrackit.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.TesteBase;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

public class HeaderSteps extends TesteBase {

    private Header header = PageFactory.initElements(driver, Header.class);

    @And("^I search products by \"([^\"]*)\"$")
    public void iSearchProductsBy(String searchKeyword){
        header.search(searchKeyword);

    }

}
