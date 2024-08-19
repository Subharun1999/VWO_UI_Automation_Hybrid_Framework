package com.vwo.app.pages.pageObjectModel;

import com.vwo.app.base.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.Properties;
import static com.vwo.app.utils.PropertyReader.readPropertiesFile;

public class LoginPage_POM extends CommonToAll {

	WebDriver driver;

	public LoginPage_POM(WebDriver driver) throws IOException {
		this.driver = driver;
	}

	private By username = By.xpath("//input[@id = 'login-username']");
	private By password = By.xpath("//input[@id = 'login-password']");
	private By login_btn = By.xpath("//button[@id = 'js-login-btn']");
	private By success_msg_notification = By.xpath("//span[text() = 'Subho Das' and @data-qa='lufexuloga']");

	Properties prop = readPropertiesFile("data.properties");

	public String loginWithValidCred() throws IOException {

			enterInput(username, prop.getProperty("username"));
			enterInput(password, prop.getProperty("password"));
			clickElement(login_btn);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		WebElement txt = presenceOfElement(success_msg_notification);
		return txt.getText();
	}
}
