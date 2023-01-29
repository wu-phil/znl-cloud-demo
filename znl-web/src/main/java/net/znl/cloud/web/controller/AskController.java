package net.znl.cloud.web.controller;

import net.znl.cloud.api1.Teacher;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

    @DubboReference(version = "2.0")
    private Teacher teacher;

    @GetMapping("name")
    public String name(){
        return teacher.name();
    }
}
