package com.ksbyun.study.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ksbyun.study.demo.user.model.User;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public void saveUser(User user) {
        this.userRepository.saveUser(user);
    }

    public User getUserById(String loginId) {
        User user = this.userRepository.getUserById(loginId)
                .orElseThrow(() -> new UsernameNotFoundException("login id not found"));
        
        user.setLoginPw("hide");
        return user;
    }
    
    public boolean updateUser(User user) {
        return this.userRepository.updateUser(user) == 1 ? true : false;
    }
    
    public boolean deleteUser(String loginId) {
        return this.userRepository.deleteUser(loginId) == 1 ? true : false;
    }
}
