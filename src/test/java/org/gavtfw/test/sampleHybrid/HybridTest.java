package org.gavtfw.test.sampleHybrid;

import io.restassured.response.Response;
import org.gavtfw.test.BaseHybridTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HybridTest extends BaseHybridTest {
    //UI
    @Test
    public void isHomeLoaded(){
        boolean isHomeLoaded = hybridFramework.openApp()
                .isHomeLoaded();

        Assert.assertEquals(isHomeLoaded,true);

        hybridFramework.closeApp();
    }

    @Test
    public void getUsers(){
        Response response = hybridFramework.getUserAPI("6");
        Assert.assertEquals(response.statusCode(),200);
    }



}
