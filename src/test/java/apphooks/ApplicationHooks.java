package apphooks;

import java.io.IOException;

import com.utility.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks extends Utility {
		
	@Before()
	public void launchBrowser() throws IOException {
		

		Utility.launchingBrowser();
		
		Utility.launchingApp();
		//maximize the window
		driver.manage().window().maximize();
		
		
	}

	@After()
	public void quitBrowser() throws InterruptedException {
	
	Utility.closingBrowser();
	report.flush();
		
	}


}