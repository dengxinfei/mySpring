package com.kelvin.myspring.pattern.proxy.custom;

/**
 * @ClassName CustomTest
 * @Author xinfei
 * @Date 2019/1/16 16:55
 **/
public class CustomTest {

    public static void main(String[] args) {
        IKelvinInvocation invocation = new CustomInvocation(new HouseOwner());

        IHouseOwner proxy = (IHouseOwner)KelvinProxy.newProxyInstance(new KelvinClassLoader(), new Class[]{IHouseOwner.class}, invocation);
        proxy.buyHouse();
        proxy.rentHouse("三室两厅", 2, "*********");

    }
}
