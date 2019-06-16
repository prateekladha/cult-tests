package com.curefit.api.backend.utils;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RestAssuredClient {

    public Map<String, Object> getDefaultHeaders() {
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("accept", "application/json");
        headers.put("accept-language", "en-GB,en-US;q=0.9,en;q=0.8");
        headers.put("apikey", "9d153009-e961-4718-a343-2a36b0a1d1fd");
        headers.put("appversion", 7);
        headers.put("cache-control", "no-cache");
        headers.put("content-type", "application/json");
        headers.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        headers.put("osname", "browser");
        return headers;
    }

    public Response get(String url, RequestSpecification requestSpecification) {
        Response response = requestSpecification.when().get(url);
        Factory.setResponse(response);
        return response;
    }

    public Response post(String url, RequestSpecification requestSpecification) {
        Response response = requestSpecification.when().post(url);
        Factory.setResponse(response);
        return response;
    }
}
