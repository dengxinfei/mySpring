package com.kelvin.myspring.pattern.singleton.hungry;

/**
 * 饿汉模式
 *
 * @ClassName HungrySingletion
 * @Author xinfei
 * @Date 2019/1/8 18:52
 **/
public class HungrySingletion {

    //类加载的时候就将对象实例化完毕。
    //浪费内存空间，如果对象没有被使用，那么空间就会浪费掉
    private final static HungrySingletion hungry = new HungrySingletion();

    private HungrySingletion(){}

    //没有并发问题，因为在使用之前就已经初始化完成
    public static HungrySingletion getInstance(){
        return hungry;
    }

}
