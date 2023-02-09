package org.gavtfw.function;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.gavtfw.api.userAPI.UserAPI;
import org.gavtfw.ui.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HybridFramework{

    protected WebDriver driver;


    //UI Suite Functions
    public void getChromeDriver() {
        WebDriverManager.chromedriver().setup(); //Bonigarcia used
    }

    public WebDriver createChromeDriver() {
        getChromeDriver();
        driver = new ChromeDriver();
        return driver;
    }

    public void closeApp(){
        driver.quit();
    }


    //UI Flow - Pages
    protected HomePage homePage;

    //API Flow - User
    protected UserAPI userAPI;



    //UI Code running
    public HybridFramework openApp(){
        createChromeDriver();
        homePage = new HomePage(driver);
        homePage.navigateToHome();
        return this;
    }

    public boolean isHomeLoaded(){
        return homePage.isHomePageVisible();
    }

    //API Code Running
    public Response getUserAPI(String id){
        userAPI = new UserAPI();
        return userAPI.getUser(id);
    }

}
