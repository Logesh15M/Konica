package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources", glue= "org.step", dryRun = false,
plugin = {"json:C:\\Users\\Lokesh\\eclipse-workspace\\KonicaMinolta\\Reports\\JsonReport\\JsonRep.json"})
public class RunnerClass {
	
	@AfterClass
	public static void callingJVM() {
		JvmReportClass.jvmReport("C:\\\\Users\\\\Lokesh\\\\eclipse-workspace\\\\KonicaMinolta\\\\Reports\\\\JsonReport\\\\JsonRep.json");

	}

}
