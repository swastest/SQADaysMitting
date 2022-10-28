package mitting.sqa.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import mitting.sqa.request.RequestBuilder;
import mitting.sqa.request.RequestExecutor;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import mitting.sqa.responce.ResponseHandler;

public class BaseClass {
    public RequestBuilder requestBuilder = new RequestBuilder();
    public RequestExecutor requestExecutor = new RequestExecutor();
    public ResponseHandler responseHandler = new ResponseHandler();
    public static Response RESPONSE;
    public JSONObject requestBody = new JSONObject();
    @BeforeAll
    static void setUp(){
        RestAssured.baseURI="https://reqres.in";
    }
}
