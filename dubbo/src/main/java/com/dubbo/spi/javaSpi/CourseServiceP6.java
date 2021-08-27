package com.dubbo.spi.javaSpi;

/*
 @author:   chenyang
 @date  2021/8/27 3:34 下午

*/

public class CourseServiceP6 implements CourseService{

    @Override
    public void classBegin() {
        System.out.println("P6 course start!!!!!!");
    }
}
