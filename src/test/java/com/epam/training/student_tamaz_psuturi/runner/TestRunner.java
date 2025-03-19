package com.epam.training.student_tamaz_psuturi.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"com.epam.training.student_tamaz_psuturi.stepdefinitions", "com.epam.training.student_tamaz_psuturi.hooks"},
		tags = "@negative",
		features = "src/test/java/com/epam/training/student_tamaz_psuturi/features"
)
public class TestRunner {
}
