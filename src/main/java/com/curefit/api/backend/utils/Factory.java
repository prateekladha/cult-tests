package com.curefit.api.backend.utils;

import io.restassured.response.Response;

public class Factory {

    private static String baseUrl;
    private static String cookie;
    private static Response response;

    public static String getCookie() {
        return cookie;
    }

    public static void setCookie(String _cookie) {
        if(cookie == null)
            cookie = "";
        cookie += _cookie;
    }

    public static String getbaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String _baseUrl) {
        baseUrl = _baseUrl;
    }

    public static Response getResponse() {
        return response;
    }

    public static void setResponse(Response _response) {
        response = _response;
    }
}
