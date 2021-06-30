package org.dep.example;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin"},
        plugin = {"pretty","html:target/HtmlReports"},
        tags = "@StaffTest",
        features = {"src/test/resources/features"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
