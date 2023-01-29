package net.znl.cloud.service1.service;

import net.znl.cloud.api1.Teacher;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "2.0")
public class TeacherImplV2 implements Teacher {

    @Override
    public String name() {
        return "我的新名字";
    }

    @Override
    public String answer(String q) {
        return q;
    }
}
