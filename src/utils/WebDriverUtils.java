package utils;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	private WebDriver driver;

	public void launch(String browser) {

		if (browser.trim().equalsIgnoreCase("IE")) {
			// driver = new InternetExplorerDriver();
			System.out.println("IE Launched");
		} else if (browser.trim().equalsIgnoreCase("CHROME")) {
			// driver = new ChromeDriver();
			System.out.println("Chrome Launched");
		} else if (browser.trim().equalsIgnoreCase("FIREFOX")) {
			// driver = new FirefoxDriver();
			System.out.println("Firefox Launched");
		} else {
			System.out.println("Entered browser name is not exist");
		}

	}

}
