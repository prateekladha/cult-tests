package com.curefit.api.backend.pages;

import com.curefit.api.backend.utils.Factory;
import com.curefit.api.backend.utils.RestAssuredClient;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class Cult extends RestAssuredClient {

    public void navigate() {
        Map<String, Object> headers = getDefaultHeaders();
        System.out.println(Factory.getCookie());
        headers.put("cookie", Factory.getCookie());
        RequestSpecification requestSpecification = RestAssured.given().config(RestAssured.config()).contentType("application/json").headers(headers);
        get(Factory.getbaseUrl() + "/api/page/cult?seoPageId=cult", requestSpecification);
    }
}
