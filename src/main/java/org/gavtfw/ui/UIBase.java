package org.gavtfw.ui;

import org.openqa.selenium.WebDriver;

public class UIBase {
    protected WebDriver driver;

    public UIBase(WebDriver driver) {
        this.driver = driver;
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void openApp(String url){
        driver.get(url);
        maximizeWindow();
    }



}
