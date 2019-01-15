package com.kelvin.myspring.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName RegisterSingletion
 * @Author xinfei
 * @Date 2019/1/10 18:05
 **/
public class RegisterSingleton {

    private RegisterSingleton(){}

    private static Map<String, RegisterSingleton> registerMap = new ConcurrentHashMap<>();

    private static Map<String, RegisterSingleton> register2Map = new HashMap<>();

    public static RegisterSingleton getInstance(){
        String name = RegisterSingleton.class.getName();
        if(registerMap.get(name) == null){
            //保证并发线程安全
            registerMap.putIfAbsent(name, new RegisterSingleton());
        }
        return registerMap.get(name);
    }
}
