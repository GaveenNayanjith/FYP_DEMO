package org.gavtfw.ui.page;

import org.gavtfw.ui.UIBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends UIBase {

    private final String homeLnk = "https://www.ebay.com/";
    private final By homePageMainLogoLnk = By.xpath("//a[@id='gh-la']");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage navigateToHome(){
        openApp(homeLnk);
        return this;
    }

    public boolean isHomePageVisible(){
        return driver.findElement(homePageMainLogoLnk).isDisplayed();
    }



}
