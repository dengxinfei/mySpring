package com.kelvin.myspring.pattern.singleton.hungry;

/**
 * @ClassName Main
 * @Author xinfei
 * @Date 2019/1/8 18:56
 **/
public class Main {

    //饿汉模式
    public static void main(String[] args) {
        System.out.println(HungrySingletion.getInstance());
    }
}
