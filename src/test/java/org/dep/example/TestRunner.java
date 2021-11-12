package org.dep.example;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/HtmlReports", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        tags = "@VillageTest, @test",
        features = {"src/test/resources/features"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
