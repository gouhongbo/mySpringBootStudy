package com.shengsiyuan.boot.controller;


import java.util.Date;

import com.shengsiyuan.boot.config.MyConfig;
import com.shengsiyuan.boot.domain.Person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

@Autowired
MyConfig myConfig;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Object test() {
        Person person = new Person();
        person.setId(3);
        person.setName("zhansan");
        person.setBirthday(new Date());
        System.out.println(this.myConfig.getConfig().getMyName());
        System.out.println(this.myConfig.getConfig().getMyAge());
        return person;


    }

}