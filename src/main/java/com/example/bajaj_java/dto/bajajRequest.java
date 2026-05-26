package com.example.bajaj_java.dto;

import java.util.List;

public class bajajRequest {

    private List<String> data;

    public bajajRequest() {
    }

    public bajajRequest(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}