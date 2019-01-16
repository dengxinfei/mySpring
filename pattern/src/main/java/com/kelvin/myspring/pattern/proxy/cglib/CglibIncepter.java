package com.kelvin.myspring.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 真实接口处理的实现类
 *
 * @ClassName CglibIncepter
 * @Author xinfei
 * @Date 2019/1/15 17:23
 **/
public class CglibIncepter implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是Cglib: 执行方法前。。。。。。。");
        System.out.println("我是Cglib: 调用函数 " + method.getName());
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("我是Cglib: 执行方法后。。。。。。。");
        return obj;
    }
}
