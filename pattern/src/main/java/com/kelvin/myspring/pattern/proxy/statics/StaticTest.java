package com.kelvin.myspring.pattern.proxy.statics;

/**
 * @ClassName StaticTest
 * @Author xinfei
 * @Date 2019/1/15 16:35
 **/
public class StaticTest {

    public static void main(String[] args) {
        HouseProxy proxy = new HouseProxy(new HouseOwner());
        System.out.println(proxy);
        proxy.buyHouse();
        proxy.rentHouse();
    }
}
