package com.kelvin.myspring.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName HouseProxy
 * @Author xinfei
 * @Date 2019/1/15 16:38
 **/
public class HouseProxy {


    //动态代理：
    //1. 不需要提前创建好代理类
    //2. 如果目标类发送修改，可以实现动态扩展，更好的支持了开闭原则
    public static Object getInstance(IHouseOwner houseOwner){
        //构建动态处理真实调用的处理类
        InvocationHandler handler = new HouseInvocationHandler(houseOwner);
        //返回动态代理对象
        return Proxy.newProxyInstance(houseOwner.getClass().getClassLoader(), houseOwner.getClass().getInterfaces(), handler);
    }

}
