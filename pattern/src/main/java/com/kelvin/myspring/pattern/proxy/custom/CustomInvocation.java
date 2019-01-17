package com.kelvin.myspring.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * @ClassName CustomInvocation
 * @Author xinfei
 * @Date 2019/1/16 16:56
 **/
public class CustomInvocation implements IKelvinInvocation {

    private Object realObj;

    public CustomInvocation(Object realObj){
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(realObj, args);
        return result;
    }
}
