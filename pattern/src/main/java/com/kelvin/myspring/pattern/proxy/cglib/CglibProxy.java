package com.kelvin.myspring.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName CglibProxy
 * @Author xinfei
 * @Date 2019/1/15 17:35
 **/
public class CglibProxy {

    //获取代理对象实例
    //当前方法跟JDK提供的动态代理实现了相同的效果，只是不同的写法。
    public static HouseOwner getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //设置代理的类
        enhancer.setSuperclass(clazz);
        //配置代理处理回调类
        enhancer.setCallback(new CglibIncepter());
        //创建代理对象
        HouseOwner houseOwner = (HouseOwner)enhancer.create();
        return houseOwner;
    }
}
