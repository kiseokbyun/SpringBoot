package com.ksbyun.study.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksbyun.study.demo.user.model.UserVO;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public UserVO getUserById(String id) {
        return userRepository.getUserById(id);
    }
}
