package test;

import utils.WebDriverUtils;

public class MyTests implements Runnable {

	public MyTests(String browser) {
		new WebDriverUtils().launch(browser);
	}

	public void run() {

	}

}
