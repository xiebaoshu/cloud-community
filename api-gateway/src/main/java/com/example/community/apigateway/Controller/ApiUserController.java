package com.example.community.apigateway.Controller;

import com.example.community.apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiUserController {
    @Autowired
    private UserService userService;
    @RequestMapping("test/getusername")
    public String getusername(Long id){
        return userService.getusername(id);
    }
}
