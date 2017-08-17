package AutomationTesting.seleniumTesting;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.UUID;

public class AppTest25 {

	static final Logger logger = LogManager.getLogger(AppTest25.class);

	WebDriver driver;

	@BeforeMethod
	public void Before() throws MalformedURLException {
		UUID uuid = UUID.randomUUID();
		logger.info(uuid + " creating driver");
		driver = WebDriverFactory.CreateNew();
		logger.info(uuid + " I am  done with creating driver");
	}

	@AfterMethod
	public void After() throws MalformedURLException {
		UUID uuid = UUID.randomUUID();
		logger.info(uuid + " quitting driver");
		driver.quit();
		logger.info(uuid + " quited driver");
	}

//	@Test()
//	public void AppTest0_testJunit() throws MalformedURLException, InterruptedException {
//
//		//Launch the Online Store Website
//		String url= "htp://www.junit.org/";
//		driver.get(url);
//
//		// Print a Log In message to the screen
//		logger.info("Successfully opened the website: "+url);
//
//	}
//
//	@Test
//	public void AppTest0_testSkillGuru() throws MalformedURLException, InterruptedException {
//
//		//Launch the Online Store Website
//		String url= "ht://www.skill-guru.com/";
//		driver.get(url);
//
//		// Print a Log In message to the screen
//		logger.info("Successfully opened the website: "+url);
//
//	}

	@Test
	public void AppTest0_testMaven() throws MalformedURLException, InterruptedException {

		//Launch the Online Store Website
		String url= "http://maven.apache.org/";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);

	}

	@Test
	public void AppTest0_testGithub() throws MalformedURLException, InterruptedException {

		//Launch the Online Store Website
		String url= "https://www.github.com/";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);
	}

	@Test
	public void AppTest0_testTrello() throws MalformedURLException, InterruptedException {

		//Launch the Online Store Website
		String url= "https://www.trello.com/paloit4";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);          
	}


	@Test
	public void AppTest0_testGoogle() throws MalformedURLException, InterruptedException {

		logger.info("I am  done with creating driver");
		//Launch the Online Store Website
		driver.get("http://www.google.com");     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website www.google.com");          
		//Wait for 5 Sec

	}
	@Test
	public void AppTest0_testStackOverFlow() throws MalformedURLException, InterruptedException {

		logger.info("I am  done with creating driver");
		//Launch the Online Store Website
		String url= "https://www.stackoverflow.com";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);

	}

	@Test
	public void AppTest0_testFileHippo() throws MalformedURLException, InterruptedException {

		//Launch the Online Store Website
		String url= "http://www.filehippo.com";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);
	}

	@Test
	public void AppTest0_testFB() throws MalformedURLException, InterruptedException {

		//Launch the Online Store Website
		String url= "https://www.facebook.com";
		driver.get(url);     

		// Print a Log In message to the screen
		logger.info("Successfully opened the website: "+url);
	}




}
