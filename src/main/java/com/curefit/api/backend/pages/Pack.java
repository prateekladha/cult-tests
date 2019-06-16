package com.curefit.api.backend.pages;

import com.curefit.api.backend.utils.Factory;
import com.curefit.api.backend.utils.RestAssuredClient;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class Pack extends RestAssuredClient {

    public void selectPack(int packid, String date) {
        Map<String, Object> headers = getDefaultHeaders();
        System.out.println(Factory.getCookie());
        headers.put("cookie", Factory.getCookie());
        RequestSpecification requestSpecification = RestAssured.given().config(RestAssured.config()).contentType("application/json").headers(headers);
        get(Factory.getbaseUrl() + "/api/pack/cult/" + packid + "?packId=" + packid + "&forceEnableBuy=true&isSubscriptionPack=false&pageType=cultpack&seoPageId=cult&startDate=" + date + "", requestSpecification);
    }
}
