package com.ksbyun.study.demo.user;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.ksbyun.study.demo.DemoApplication;

@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserCrudTest {
    
    @Autowired
    private UserController userController;
    
    private MockMvc mockMvc;
    
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }
    
    @Test
    public void test0001userCreate() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("loginId", "ksbyun");
        params.add("loginPw", "password");
        
        mockMvc.perform(put("/user").params(params))
                .andDo(print())
                .andExpect(status().isOk());
    }
    @Test
    public void test0002userRead() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("loginId", "ksbyun");
        
        mockMvc.perform(get("/user").params(params))
                .andDo(print());
    }
    @Test
    public void test0003userUpdate() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("loginId", "ksbyun");
        params.add("loginPw", "password2");
        
        mockMvc.perform(post("/user").params(params))
                .andDo(print());
    }
    
    @Test
    public void test0004userDelete() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("loginId", "ksbyun");
        
        mockMvc.perform(delete("/user").params(params))
                .andDo(print());
        
    }
}
