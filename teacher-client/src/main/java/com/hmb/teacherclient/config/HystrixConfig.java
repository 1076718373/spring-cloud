package com.hmb.teacherclient.config;

import com.hmb.teacherclient.dao.TeacherMapper;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static java.util.concurrent.TimeUnit.SECONDS;
/**
 * 必须实现 StudentMapper(自定义),
 */
@Configuration
public class HystrixConfig implements TeacherMapper {


    @Override
    public String getStu(String id) {
        return "在调用student系统的getStudent()方法时,出现了异常";
    }
}
