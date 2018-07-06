package com.hmb.studentclient.view;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stu")
@RestController
public class StudentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public String getStudent(@PathVariable("id") String id){
        return "您访问的是学生系统模块，访问的端口号是："+port+",  ID:"+id;
    }
}
