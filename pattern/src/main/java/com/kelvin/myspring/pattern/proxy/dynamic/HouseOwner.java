package com.kelvin.myspring.pattern.proxy.dynamic;

/**
 * @ClassName HouseOwner
 * @Author xinfei
 * @Date 2019/1/15 16:14
 **/
public class HouseOwner implements IHouseOwner {

    //目标类
    @Override
    public void buyHouse() {
        System.out.println("我是房主： 我有买房房源");
    }

    @Override
    public void rentHouse() {
        System.out.println("我是房主： 我有租房房源");
    }
}
