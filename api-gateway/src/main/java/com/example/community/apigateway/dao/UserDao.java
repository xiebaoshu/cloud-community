package com.example.community.apigateway.dao;

import com.example.community.apigateway.common.RestResponse;
import com.example.community.apigateway.config.GenericRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private GenericRest rest;

    public String getusername(Long id){
        String url ="direct://http://127.0.0.1:8083/getusername?id="+id;
        RestResponse<String> response =  rest.get(url, new ParameterizedTypeReference<RestResponse<String>>() {
        }).getBody();
        return  response.getResult();
    }
}
