package com.rpc.dynamicProxy.example;

/*
 @author:   chenyang
 @date  2021/8/25 2:48 下午

*/

public class AMerchantServiceImplA implements ASellService{

    @Override
    public void sale(String name) {
        System.out.println(name + "购买了A商品");
    }
}
