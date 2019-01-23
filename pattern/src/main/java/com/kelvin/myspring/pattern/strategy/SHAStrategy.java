package com.kelvin.myspring.pattern.strategy;

/**
 * @ClassName SHAStrategy
 * @Author xinfei
 * @Date 2019/1/22 16:34
 **/
public class SHAStrategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("使用SHA的方式进行加密。。。。。。");
    }
}
