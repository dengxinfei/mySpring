package com.kelvin.myspring.pattern.proxy.dynamic;

/**
 * @ClassName DynamicTest
 * @Author xinfei
 * @Date 2019/1/15 16:57
 **/
public class DynamicTest {

    public static void main(String[] args) {
        IHouseOwner houseOwner = new HouseOwner();
        IHouseOwner proxy = (IHouseOwner)HouseProxy.getInstance(houseOwner);
        proxy.buyHouse();
        System.out.println(proxy.getClass());
    }

}
