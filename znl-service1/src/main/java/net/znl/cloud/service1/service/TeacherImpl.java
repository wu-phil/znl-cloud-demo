package net.znl.cloud.service1.service;

import net.znl.cloud.api1.Teacher;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TeacherImpl implements Teacher {
    @Override
    public String name() {
        return "小飞飞";
    }

    @Override
    public String answer(String q) {
        return "你的问题是：" + q + "，答案是：不知道";
    }
}
