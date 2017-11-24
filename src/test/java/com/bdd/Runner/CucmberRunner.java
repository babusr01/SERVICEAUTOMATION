package com.bdd.Runner;


import com.Service.common.ExtentReportUtility;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"usage:target/cucumber-usage.json"},
                                       glue = {"com/bdd/StepDefinations/"},
                                        features = {"src/test/java/com/bdd/Features/"})
public class CucmberRunner {

    @BeforeClass
    public static  void setUpBeforeClass(){

        ExtentReportUtility.init();
    }

    @AfterClass
    public static  void tearDownAfterClass(){


    }

}
