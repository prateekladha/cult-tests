package com.curefit.api.backend.pages;

import com.curefit.api.backend.utils.Factory;
import com.curefit.api.backend.utils.RestAssuredClient;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Iterator;
import java.util.Map;

public class Login extends RestAssuredClient {

    String baseUrl= "https://www.cure.fit";

    public void auth(String emailAddress, String passwordHash) {
        Factory.setBaseUrl(baseUrl);
        Map<String, Object> headers = getDefaultHeaders();
        headers.put("cookie", "deviceId=s%3A39c18c0b-30a1-4edb-be78-dc375eb85977.7nhV1TyxWBdsgx%2FyiR%2BoDpvik6v8iWXOIeAj%2BLRYV8Q;");
        String payload = "{\"email\":\"" + emailAddress + "\",\"password\":\"" + passwordHash + "\",\"deviceInfo\":{\"appId\":\"web\",\"brand\":\"browser\",\"model\":\"browser\",\"osName\":\"browser\",\"osVersion\":5.1,\"pushNotificationToken\":\"na\",\"cityId\":\"Bangalore\"}}";
        RequestSpecification requestSpecification = RestAssured.given().config(RestAssured.config()).contentType("application/json").headers(headers).body(payload);
        Response response = post(baseUrl + "/api/auth/login", requestSpecification);
        System.out.println(response.getStatusCode());
        Headers _headers = response.getHeaders();
        Iterator<Header> iter = _headers.iterator();
        String cookie = "";
        while(iter.hasNext()) {
            Header header = iter.next();
            String key = header.getName();
            String value = header.getValue();
            if(key.trim().equalsIgnoreCase("set-cookie")) {
                cookie += value;
            }
        }
        Factory.setCookie(cookie);
    }
}
