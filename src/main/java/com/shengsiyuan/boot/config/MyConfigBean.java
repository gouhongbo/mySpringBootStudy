package com.shengsiyuan.boot.config;

import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {
    @Value("${config.myObject.myName}")
    private String myName;
    @Value("${config.myObject.myAge}")
    private String myAge;

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
