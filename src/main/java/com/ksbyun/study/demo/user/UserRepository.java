package com.ksbyun.study.demo.user;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksbyun.study.demo.user.model.User;

@Repository
public class UserRepository {
    @Autowired
    SqlSession sqlSession;
    
    public int saveUser(User user) {
        return sqlSession.insert("user.saveUser", user);
    }
    
    public Optional<User> getUserById(String loginId) {
        User user = sqlSession.selectOne("user.findUserById", loginId);
        return Optional.ofNullable(user);
    }
    
    public int updateUser(User user) {
        return sqlSession.update("user.updateUser", user);
    }
    
    public int deleteUser(String loginId) {
        return sqlSession.delete("user.deleteUser", loginId);
    }
}
