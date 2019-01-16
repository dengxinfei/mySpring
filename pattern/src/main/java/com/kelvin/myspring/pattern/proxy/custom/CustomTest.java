package com.kelvin.myspring.pattern.proxy.custom;

/**
 * @ClassName CustomTest
 * @Author xinfei
 * @Date 2019/1/16 16:55
 **/
public class CustomTest {

    public static void main(String[] args) {
        Object proxy = KelvinProxy.newProxyInstance(new KelvinClassLoader(), new Class[]{IHouseOwner.class}, new CustomInvocation());


    }
}
