package com.springsport.backend.config;

public class Endpoint {
    public static final String front_end_host = "http://localhost:3000";
    public static final String[] PUBLIC_GET_ENDPOINS = {
            "/product",
            "/category/**",
            "/brand",
            "/image/**",
    };

    public static final String[] PUBLIC_POST_ENDPOINS = {
            "/product",
            "/category/**",
            "/brand",
            "/image/**",
    };

    public static final String[] PUBLIC_ADMIN_ENDPOINS = {
            "/product",
            "/category/**",
            "/brand",
            "/image/**",
    };
}
