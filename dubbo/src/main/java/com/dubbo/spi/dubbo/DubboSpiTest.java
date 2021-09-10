package com.dubbo.spi.dubbo;

/*
 @author:   chenyang
 @date  2021/8/27 3:39 下午

*/

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.cluster.Cluster;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import com.dubbo.spi.javaSpi.CourseService;

import java.util.ServiceLoader;

public class DubboSpiTest {
    public static void main(String[] args) {
        ExtensionLoader<com.dubbo.spi.dubbo.CourseService> extensionLoader=ExtensionLoader.getExtensionLoader(com.dubbo.spi.dubbo.CourseService.class);
        com.dubbo.spi.dubbo.CourseService courseP6Service=extensionLoader.getExtension("p6");
        courseP6Service.classFinish();

        com.dubbo.spi.dubbo.CourseService courseP7Service=extensionLoader.getExtension("p7");
        courseP7Service.classFinish();

        //类似Spring Ioc,通过指定名称获得负载均衡对象
        LoadBalance roundRobinLoadBalance=ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension(RoundRobinLoadBalance.NAME);
        //自适应获得负载均衡对象，即在运行时根据上游的参数来决定用哪个负载均衡对象
        LoadBalance loadBalance=ExtensionLoader.getExtensionLoader(LoadBalance.class).getAdaptiveExtension();

    }
}
