package com.hmb.teacherclient.view;

import com.hmb.teacherclient.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tea")
public class TeacherController {
    @Value("${server.port}")
    private String port;

    @Autowired
    TeacherService teacherService;
    @GetMapping("/{id}")
    public String getTea(@PathVariable("id") String id){
        return "1.访问了Teacher系统,端口号为 : "+port+"  ; 2."+teacherService.getTea(id);
    }

}
