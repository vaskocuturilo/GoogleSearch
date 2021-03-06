package org.googlesearch.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.googlesearch.utils.DriverMaster.*;


public class SearchGoogle {
    private final WebDriver driver;

    public SearchGoogle(WebDriver driver) {

        this.driver = driver;
    }

    public ResultSearch doSearch(String text) {
        driver.findElement(By.id(MainField)).sendKeys(text + "\n");
        return new ResultSearch(driver);
    }

    public ResultSearch doSearchImage() {
        driver.findElement(By.linkText(LinkImages)).click();
        driver.findElement(By.id(MainField)).click();
        return new ResultSearch(driver);
    }

    public ResultSearch doSearch() {
        driver.findElement(By.linkText(LinkAll)).click();
        return new ResultSearch(driver);
    }
}
