package mitting.sqa.utils;

import mitting.sqa.request.HttpMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClass extends BaseClass {

    @Disabled
    @Test
    void createUser(){
        requestBuilder.setRequestMethod(HttpMethods.POST);
        requestBody.put("name","TTTT");
        requestBody.put("job","QA");
        requestBuilder.setRequestBody(requestBody);
        requestBuilder.setPath("/api/users");
        Assertions.assertEquals(responseHandler.getStatusCode(), 201);
        Assertions.assertEquals(responseHandler.getResponseObject("name"),"TTTT");
        Assertions.assertTrue(responseHandler.getResponseTime()<5000);
    }

}
