package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"html:target/cucumber", "json:target/json-raports/product-sorting.json"},
        glue = {"org.fasttrackit"},
        features = {"scr/test/resourses/features/product-sorting.feature"}
)
@RunWith(Cucumber.class)
public class ProductSortingRunner {
}
