package com.hmb.teacherclient.service;

import com.hmb.teacherclient.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public String  getTea(String id){
        return teacherMapper.getStu(id);
    }
}
