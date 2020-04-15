package com.example.community.userservice.Controller;

import com.example.community.userservice.common.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("getusername")
    public RestResponse<String> getusername(Long id){
        LOGGER.info("incoming request");
        return RestResponse.success("test-name");
    }

}
