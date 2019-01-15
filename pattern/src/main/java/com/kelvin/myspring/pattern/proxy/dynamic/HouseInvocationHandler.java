package com.kelvin.myspring.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName HouseInvocationHandler
 * @Author xinfei
 * @Date 2019/1/15 16:44
 **/
public class HouseInvocationHandler implements InvocationHandler {

    //真实的对象，用于反射的时候进行函数调用
    private Object realObj;

    public HouseInvocationHandler(Object realObj){
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是新生成的中介： 开始帮你找房");
        System.out.println("开始调用函数：" + method.getName());
        Object result = method.invoke(realObj, args);
        System.out.println("我是新生成的中介： 我们开始签合同");
        return result;
    }
}
