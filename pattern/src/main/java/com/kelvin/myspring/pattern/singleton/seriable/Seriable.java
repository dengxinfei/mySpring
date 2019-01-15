package com.kelvin.myspring.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @ClassName Seriable
 * @Author xinfei
 * @Date 2019/1/9 18:14
 **/
public class Seriable implements Serializable {

    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    //ObjectInputStream在反序列化的时候，生成对象如果对象中有readResolve方法，直接读取方法返回的对象。
    // 即使序列化的属性已经初始化完毕。
    private Object readResolve(){
        return INSTANCE;
    }
}
