package com.example.community.apigateway.service;

import com.example.community.apigateway.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String getusername(Long id){
        return userDao.getusername(id);
    }

}
