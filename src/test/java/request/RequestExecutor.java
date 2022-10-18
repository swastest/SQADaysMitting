package request;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static utils.BaseClass.RESPONSE;

public class RequestExecutor {
    public  void  request(RequestBuilder requestBuilder){
        switch (requestBuilder.getRequestMethod()){
            case GET:
                RESPONSE = given().contentType(JSON).body(requestBuilder.getRequestBody()).when().log().all()
                        .get(requestBuilder.getPath());
                break;
            case PUT:
                RESPONSE = given().contentType(JSON).body(requestBuilder.getRequestBody()).when().log().all()
                        .put(requestBuilder.getPath());
                break;
            case POST:
                RESPONSE = given().contentType(JSON).body(requestBuilder.getRequestBody()).when().log().all()
                        .post(requestBuilder.getPath());
                break;
            case DELETE:
                RESPONSE = given().contentType(JSON).body(requestBuilder.getRequestBody()).when().log().all()
                        .delete(requestBuilder.getPath());
                break;
        }
    }
}
