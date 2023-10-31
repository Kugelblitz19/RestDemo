package com.rest.RestDemo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object responseObject) {
        Map<String, Object> response = new HashMap<>();
        response.put("httpStatus", httpStatus);  // Move httpStatus before message
        response.put("message", message);  // Swap the order of httpStatus and message
        response.put("Data", responseObject);
        return new ResponseEntity<>(response, httpStatus);
    }
}
