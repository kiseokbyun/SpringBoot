package com.ksbyun.study.demo.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksbyun.study.demo.user.model.UserVO;

@Repository
public class UserRepository {
    @Autowired
    SqlSession sqlSession;
    
    public UserVO getUserById(String id) {
        return sqlSession.selectOne("user.findUserById", id);
    }
}
