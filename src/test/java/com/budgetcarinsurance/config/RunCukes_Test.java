package com.budgetcarinsurance.config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(tags={"@home"}, features="src/test/resources/com/budgetcarinsurance/config/", format="pretty")
public class RunCukes_Test{

}