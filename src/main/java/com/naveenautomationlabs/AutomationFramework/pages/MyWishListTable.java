package com.naveenautomationlabs.AutomationFramework.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyWishListTable extends TestBase {
	
	//get the WebElement from the table.
	public WebElement getCellElementFromTable(MyWishListTableEnum column,String modelName) {
		int columnIndex=getIndexOfColumn(column);
		if(columnIndex<0) {
			throw new NoSuchElementException();
		}
		List<WebElement>rowsWebElement =wd.findElements(By.cssSelector("div.table-responsive table.table tbody tr"));
		for(int i=0;i<rowsWebElement.size();i++) {
			List<WebElement>cells=rowsWebElement.get(2).findElements(By.cssSelector("td"));
			if(cells.get(i).getText().equals(modelName)) {
				cells.get(columnIndex);
			}
		}
		return null;
		
	}
	
	// Find the index of column that we are interested in
	private int getIndexOfColumn(MyWishListTableEnum columnName) {
		List<WebElement> headers = wd.findElements(By.cssSelector("table.table thead tr td"));
		for (WebElement headerElement : headers) {
			if (headerElement.getText().equals(columnName.value)) {
				return headers.indexOf(headerElement);

			}

		}
		return -1;
	}

	//created Structure of  my Webtable
	public enum MyWishListTableEnum {
		IMAGE("Image"),
		PRODUCT_NAME("Product Name"),
		MODEL("Model"),
		STOCK("Stock"),
		UNIT_PRICE("Unit"),
		ACTION("Action");
		
		String value;

		private MyWishListTableEnum(String value) {
			this.value = value;
		}

		public String getTableHeaderValue() {

			return value;

		}

	}
}
