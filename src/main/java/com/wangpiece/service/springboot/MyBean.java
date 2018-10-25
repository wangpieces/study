package com.wangpiece.service.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author wang.xu
 * @desc
 * @date 2018-10-25 23:12
 */
@Component
public class MyBean implements CommandLineRunner,Ordered{

    /**
     * CommandLineRunner SpringApplication启动完成前先执行该方法
     * ApplicationRunner作用和CommandLineRunner相同，只是参数不同，
     * 如过有多个地方实现了CommandLineRunner，则需要通过ordered来确定启动顺序，
     * 也可以使用org.springframework.core.annotation.Order进行配置
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println(args);
    }

    @Override
    public int getOrder() {
        return 0;
    }

    /**
     * Access Application Arguments
     * @param arguments
     */
    @Autowired
    public MyBean(ApplicationArguments arguments) {
        String[] sourceArgs = arguments.getSourceArgs();
        System.out.println(sourceArgs);
        List<String> nonOptionArgs = arguments.getNonOptionArgs();
        System.out.println(nonOptionArgs);
    }


}
