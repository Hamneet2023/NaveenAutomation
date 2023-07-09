package com.naveenautomationlabs.AutomationFramework.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Utils extends TestBase {
	public static void takeScreenShot(String testName) {
		//Time Stemp
		String timeStamp = new SimpleDateFormat("dd.MM.YYYY.HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
		
		//Take a Screenshot
		File screenshotFile=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		
		//Save ScreenShot
		try {
			FileUtils.copyFile(screenshotFile,new File("./FailedTestsScreenshot\\"+ testName+"_" +timeStamp+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
