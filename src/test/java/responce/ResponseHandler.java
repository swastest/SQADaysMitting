package responce;

import java.util.concurrent.TimeUnit;

import static utils.BaseClass.RESPONSE;

public class ResponseHandler {
    public int getStatusCode(){
        return RESPONSE.getStatusCode();
    }

    public String getResponseBody(){
        return RESPONSE.getBody().asString();
    }

    public Object getResponseObject(String key){
        return RESPONSE.getBody().jsonPath().get(key);
    }

    public Long getResponseTime(){
        return RESPONSE.getTimeIn(TimeUnit.MILLISECONDS);
    }
}
