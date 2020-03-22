package com.ksbyun.study.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ksbyun.study.demo.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public void createUser(User user) {
        try {
            userService.saveUser(user);
        } catch (Exception e) {
            // user 생성 실패.
        }
    }
    
    @GetMapping("/{loginId}")
    public User getUser(@PathVariable String loginId) {
        return userService.getUserById(loginId);
    }
    
    @PutMapping("/{loginId}")
    public void updateUser(@PathVariable Integer loginId,
            @RequestBody User user) {
        this.userService.updateUser(user);
    }
    
    @DeleteMapping("/{loginId}")
    public void deleteUser(@PathVariable String loginId) {
        this.userService.deleteUser(loginId);
    }
}
