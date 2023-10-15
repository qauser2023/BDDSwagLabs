package com.sl.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sl.base.TestBase;

public class ProductsPage extends TestBase {

	By productsHeader = By.xpath("//*[text()='Products']");
	By allItems = By.xpath("//div[@id='inventory_container']//a/div");

	public boolean verifyProductPage() {
		return driver.findElement(productsHeader).isDisplayed();
	}

	public ArrayList<String> getAllItemNames() {
		ArrayList<String> productItems = new ArrayList<>();
		List<WebElement> items = driver.findElements(allItems);
		for (WebElement item : items) {
			productItems.add(item.getText());
		}
		return productItems;
	}
	
	public int getTotalItems() {
		return getAllItemNames().size();
	}

}
