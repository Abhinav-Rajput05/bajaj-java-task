package com.example.bajaj_java.service;

import com.example.bajaj_java.dto.bajajRequest;
import com.example.bajaj_java.dto.bajajResponse;

public interface bajajService {

    bajajResponse processData(bajajRequest request);
}