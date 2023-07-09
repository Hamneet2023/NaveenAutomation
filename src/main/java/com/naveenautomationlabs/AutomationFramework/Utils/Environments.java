package com.naveenautomationlabs.AutomationFramework.Utils;

public enum Environments {
  DEV("Dev","https://naveenautomationlabsDev.com/opencart/index.php?route=common/home"),
  STAGE("Stage","https://naveenautomationlabsStage.com/opencart/index.php?route=common/home"),
  QA("Qa","https://naveenautomationlabsQa.com/opencart/index.php?route=common/home"),
  PROD("Production","https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	
	String env;
	String Url;

	private Environments(String env,String URL) {
		this.env = env;
		this.Url = URL;
	}

	private String getEnv() {
		return env;
	}
	public String getUrl() {
		return Url;
	}

}
