package com.kelvin.myspring.pattern.strategy;

/**
 * @ClassName MD5Strategy
 * @Author xinfei
 * @Date 2019/1/22 16:33
 **/
public class MD5Strategy implements Strategy {

    @Override
    public void encrypt() {
        System.out.println("使用MD5的方式进行加密。。。。。。");
    }
}
