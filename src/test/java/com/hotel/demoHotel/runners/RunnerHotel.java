package com.hotel.demoHotel.runners;

import org.junit.runner.RunWith;

import com.hotel.demoHotel.utilidades.BeforeSuite;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(features = "src/test/resources/features/DemoHotel.feature", glue="com.hotel.demoHotel.definitions")
@RunWith(CucumberWithSerenity.class)

public class RunnerHotel {
	@BeforeSuite
	public static void test(){

	}
}