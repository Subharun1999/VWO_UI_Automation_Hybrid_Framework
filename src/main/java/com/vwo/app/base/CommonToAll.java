package com.vwo.app.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import static com.vwo.app.driver.DriverManager.getDriver;
import static com.vwo.app.utils.PropertyReader.readPropertiesFile;

public class CommonToAll {

	public CommonToAll() throws IOException {

	}

	//To read values from the data.properties
	Properties prop = readPropertiesFile("data.properties");

	public void openVWOLoginURL() throws IOException {
		getDriver().get(prop.getProperty("url"));
	}

	//For Page Factory
	public void clickElement(WebElement by){
		by.click();
	}

	//For Page Object Model
	public void clickElement(By by){
		getDriver().findElement(by).click();
	}

	//For Page Object Model
	public void enterInput(By by, String key){
		getDriver().findElement(by).sendKeys(key);
	}

	public void enterInput(WebElement element, String key){
		element.sendKeys(key);
	}

	public WebElement presenceOfElement(By elementLocation){
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
	}

	public WebElement visibilityOfElement(By elementLocation){
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
	}

	public WebElement getElement(By key){
		return getDriver().findElement(key);
	}

	public WebElement getElement(WebElement element){
		return element;
	}
}
