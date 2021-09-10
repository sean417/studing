package com.dubbo.spi.dubbo;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("p6")
public interface CourseService {
    void classFinish();
}
