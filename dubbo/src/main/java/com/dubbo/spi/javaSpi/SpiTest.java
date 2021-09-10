package com.dubbo.spi.javaSpi;

/*
 @author:   chenyang
 @date  2021/8/27 3:39 下午

*/

import java.util.ServiceLoader;

public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<CourseService> serviceLoader = ServiceLoader.load(CourseService.class);

        // 执行
        for (CourseService courseService : serviceLoader) {
            courseService.classBegin();
        }
    }
}
