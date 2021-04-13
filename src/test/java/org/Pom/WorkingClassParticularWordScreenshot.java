package org.Pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkingClassParticularWordScreenshot extends BaseClass {
	public static void main(String[] args) throws IOException {
		getDriver();
		loadUrl("https://www.facebook.com/");
		Maximize();
		WebElement user = driver.findElement(By.id("email"));
		type(user, "Guruprasad");
		ParticularWordTakesScreenShot(user,
				"D:\\Basic Framework Workspace 29.03.2021\\MavenDay1DataDriven\\Screenshot\\GuruWord.png");
		WebElement pass = driver.findElement(By.id("pass"));
		type(pass, "prasad");
		ParticularWordTakesScreenShot(pass,
				"D:\\\\Basic Framework Workspace 29.03.2021\\\\MavenDay1DataDriven\\\\Screenshot\\\\passWord.png");
		WebElement login = driver.findElement(By.name("login"));
		click(login);
	}

}
