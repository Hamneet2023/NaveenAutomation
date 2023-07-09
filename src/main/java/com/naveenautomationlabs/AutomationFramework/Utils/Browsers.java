package com.naveenautomationlabs.AutomationFramework.Utils;

public enum Browsers {
CHROME("Chrome"),
EDGE("Edge"),
FIREFOX("Firefox"),
SAFARI("Safari");


String browseName;
	Browsers(String nameOfBrowser){
		browseName=nameOfBrowser;
	}
	public String getBrowseName() {
		return browseName;
	}
	
}
