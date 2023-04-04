package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // junit den geliyor. junit, bir unit testing tooludur. teslerimizi junit yardımı ile koşturuyoruz.
@CucumberOptions(         // teslerimizi cukesrunner ile koşturuyoruz. bir ayağı futures'de diğer ayağı ise steps_defs dedir.
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/krafttech/steps_defs",
        dryRun = false,
        tags = "@cucumberlist"
)
public class CukesRunner {

}
