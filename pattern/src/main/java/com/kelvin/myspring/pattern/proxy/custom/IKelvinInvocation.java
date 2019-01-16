package com.kelvin.myspring.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * @ClassName KelvinInvocation
 * @Author xinfei
 * @Date 2019/1/16 16:54
 **/
public interface IKelvinInvocation {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
