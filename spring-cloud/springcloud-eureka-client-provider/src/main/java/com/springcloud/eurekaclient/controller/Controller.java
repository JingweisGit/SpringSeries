package com.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @ResponseBody
    @RequestMapping("/")
    public String printInfo(){
        return "*********hello，spring cloud*********";
    }
}
