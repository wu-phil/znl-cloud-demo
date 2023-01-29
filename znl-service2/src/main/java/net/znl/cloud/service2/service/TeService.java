package net.znl.cloud.service2.service;

import net.znl.cloud.api1.Teacher;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "2.0")
public class TeService implements Teacher {
    @Override
    public String name() {
        return "我是大飞飞";
    }

    @Override
    public String answer(String q) {
        return null;
    }
}
