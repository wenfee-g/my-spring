package com.wenfee.spring;

import com.wenfee.spring.config.AppConfig;
import com.wenfee.spring.context.ApplicationContext;
import com.wenfee.spring.service.impl.UserServiceImpl;

/**
 * @author Wenfee
 * @date 2022/11/10
 */
public class Test {
    public static void main(String[] args) {
        testIOC();
    }

    /**
     * 测试- spring IOC功能
     */
    public static void testIOC() {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        UserServiceImpl userService2 = (UserServiceImpl) applicationContext.getBean("userService");
        userService.test();
        userService2.test();
    }
}