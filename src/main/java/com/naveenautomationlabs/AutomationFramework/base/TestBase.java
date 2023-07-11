package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.naveenautomationlabs.AutomationFramework.Listeners.WebDriverEvents;
import com.naveenautomationlabs.AutomationFramework.Utils.Browsers;
import com.naveenautomationlabs.AutomationFramework.Utils.Environments;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;
	public static Logger logger;
	private WebDriverEvents events;
	private EventFiringWebDriver eDriver;
	public static WebDriverWait wait;
	//private Browsers BROWSER=Browsers.CHROME;
	private Environments ENV = Environments.PROD;


	public TestBase() {
		prop = new Properties();
		try {
			fileInputStream = new FileInputStream(
					"./src\\main\\java\\com\\naveenautomationlabs\\AutomationFramework\\Config\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void setUpLogger() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);

	}

	public void intialisation() {
		//String browserName = prop.getProperty("browser");
		String browser = System.getProperty("Browser");
		switch (browser) {
		case "Chrome":
			wd = WebDriverManager.chromedriver().create();
			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "Firefox":
			wd = WebDriverManager.firefoxdriver().create();
			break;

		default:
			System.out.println("Not a valid browser name");
			break;
		}
		
		eDriver = new EventFiringWebDriver(wd);
		events = new WebDriverEvents();
		eDriver.register(events);
		wd = eDriver;
		wd.get(ENV.getUrl());
		
		//wd.get(prop.getProperty("url"));
//		switch (DEFAULT_ENV) {
//		case DEV:
//			wd.get(DEFAULT_ENV.getUrl());
//			break;
//		case STAGE:
//			wd.get(DEFAULT_ENV.getUrl());
//			break;
//		case QA:
//			wd.get(DEFAULT_ENV.getUrl());
//			break;
//		case PROD:
//			wd.get(DEFAULT_ENV.getUrl());
//			break;
//
//		default:
//			break;
//		}
		//wd.get(prop.getProperty("url2"));
		//wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICT_WAIT")), TimeUnit.SECONDS);
		//wait = new WebDriverWait(wd, 10);
		wd.manage().window().maximize();
	}

	public void tearDown() {
		wd.quit();
	}

}
