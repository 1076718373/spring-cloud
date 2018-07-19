package com.hmb.loginclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
@RefreshScope
public class LoginController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @GetMapping("/qqq")
    public String get(){
        return "name:"+name+",age:"+age;
    }
}
