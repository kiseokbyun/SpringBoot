package com.ksbyun.study.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ksbyun.study.demo.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping(value="",  method=RequestMethod.PUT)
    public void createUser(User user) {
        try {
            userService.saveUser(user);
        } catch (Exception e) {
            // user 생성 실패.
        }
    }
    
    @RequestMapping(value="",  method=RequestMethod.GET)
    public User getUser(@RequestParam String loginId) {
        return userService.getUserById(loginId);
    }
    
    @RequestMapping(value="",  method=RequestMethod.POST)
    public void updateUser(User user) {
        this.userService.updateUser(user);
    }
    
    @RequestMapping(value="",  method=RequestMethod.DELETE)
    public void deleteUser(String loginId) {
        this.userService.deleteUser(loginId);
    }
}
