package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static request.HttpMethods.*;

public class TestClass extends BaseClass {

    @Test
    void createUser(){
        requestBuilder.setRequestMethod(POST);
        requestBody.put("name","TTTT");
        requestBody.put("job","QA");
        requestBuilder.setRequestBody(requestBody);
        requestBuilder.setPath("/api/users");
        Assertions.assertEquals(responseHandler.getStatusCode(), 201);
        Assertions.assertEquals(responseHandler.getResponseObject("name"),"TTTT");
        Assertions.assertTrue(responseHandler.getResponseTime()<5000);
    }

}
