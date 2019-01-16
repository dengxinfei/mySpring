package com.kelvin.myspring.pattern.proxy.cglib;

/**
 * @ClassName CglibTest
 * @Author xinfei
 * @Date 2019/1/15 17:39
 **/
public class CglibTest {

    public static void main(String[] args) {
        HouseOwner owner = CglibProxy.getInstance(HouseOwner.class);
        System.out.println(owner);
        owner.buyHouse();
    }
}
