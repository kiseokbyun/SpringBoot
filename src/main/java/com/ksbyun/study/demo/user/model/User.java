package com.ksbyun.study.demo.user.model;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private BigInteger sid;
    @NotNull
    private String loginId;
    @NotNull
    private String loginPw;
    
}
