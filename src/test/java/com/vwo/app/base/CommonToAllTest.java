package com.vwo.app.base;

import com.vwo.app.driver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {

	@BeforeTest
	public void setup(){
		DriverManager.init();
	}

	@AfterTest
	public void down(){
		DriverManager.down();
	}
}
