package mitting.sqa.responce;

import mitting.sqa.utils.BaseClass;

import java.util.concurrent.TimeUnit;

public class ResponseHandler {
    public int getStatusCode(){
        return BaseClass.RESPONSE.getStatusCode();
    }

    public String getResponseBody(){
        return BaseClass.RESPONSE.getBody().asString();
    }

    public Object getResponseObject(String key){
        return BaseClass.RESPONSE.getBody().jsonPath().get(key);
    }

    public Long getResponseTime(){
        return BaseClass.RESPONSE.getTimeIn(TimeUnit.MILLISECONDS);
    }
}
