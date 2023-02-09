//package org.gavtfw.function;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.gavtfw.api.userAPI.UserAPI;
//import org.gavtfw.ui.page.HomePage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseHybridFunction {
//
//    protected WebDriver driver;
//
//
//    //UI Suite Functions
//    public void getChromeDriver() {
//        WebDriverManager.chromedriver().setup(); //Bonigarcia used
//    }
//
//    public WebDriver createChromeDriver() {
//        getChromeDriver();
//        driver = new ChromeDriver();
//        return driver;
//    }
//
//
//    //UI Flow - Pages
//    protected HomePage homePage;
//
//    //API Flow - User
//    protected UserAPI userAPI;
//
//}
