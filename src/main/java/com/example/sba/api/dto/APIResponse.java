package com.example.sba.api.dto;

import jdk.jfr.DataAmount;

public class APIResponse <T>{
    int recordCount;
    T response;

    public APIResponse(int size, T result) {
    }
}
