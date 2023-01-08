package com.aarong.runner;

import com.aarong.BaseC.Base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner extends Base{
	
	@CucumberOptions(
			features = {"Feature/randomclick.feature"},
			glue = {"com.aarong.stepDeffination","com.aarong.hooks"}, 
			plugin = {"pretty","json:target/cucumber.json"},
			dryRun = false,
			monochrome = true
			//tags = "@smoke"
				
			)

	public class Runner extends AbstractTestNGCucumberTests{
		
		

	}

}
