package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import request.RequestBuilder;
import request.RequestExecutor;
import responce.ResponseHandler;

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
