package com.ksbyun.study.demo.user.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
    @NotNull
    private String id;
    @NotNull
    private String password;
}
