package com.hmb.teacherclient.dao;

import com.hmb.teacherclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "STUDENT-CLIENT",configuration = FeignConfig.class)
@Repository
public interface TeacherMapper {
    @GetMapping("/stu/{id}")
    String getStu(@PathVariable("id") String id);
}
