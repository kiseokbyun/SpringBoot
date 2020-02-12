package com.ksbyun.study.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ksbyun.study.demo.user.model.UserVO;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping(value="",  method=RequestMethod.PUT)
    public void createUser(@RequestParam UserVO user) {
        
    }
    
    @RequestMapping(value="",  method=RequestMethod.GET)
    public UserVO getUser(@RequestParam String id) {
        return userService.getUserById(id);
    }
    
    @RequestMapping(value="",  method=RequestMethod.POST)
    public void updateUser(@RequestParam UserVO user) {
        
    }
    
    @RequestMapping(value="",  method=RequestMethod.DELETE)
    public void deleteUser(@RequestParam String id) {
        
    }
}
