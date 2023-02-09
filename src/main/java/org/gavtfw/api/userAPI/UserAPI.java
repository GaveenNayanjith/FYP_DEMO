package org.gavtfw.api.userAPI;

import io.restassured.response.Response;
import org.gavtfw.api.APIBase;
import org.gavtfw.api.RestClient;
import org.gavtfw.utils.ProjectProperties;

import java.util.HashMap;
import java.util.Map;

public class UserAPI extends APIBase {

    private String url = ProjectProperties.getProperty("application.url");

    private String users = ProjectProperties.getProperty("users.path");

    UserAPITemplate userAPITemplate = new UserAPITemplate();

    public Response getUser(String id){
        RestClient client = new RestClient(url,users + id);

        Map<String,String> headers = new HashMap<>();
        headers.put("Accept","text/html");

        Response response = client.get(null,headers,null);
        logger.logInfo(" " + response.statusCode());
        logger.logInfo(" " + response.getBody().asString());

        return response;
    }

}
