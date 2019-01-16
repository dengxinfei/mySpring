package com.kelvin.myspring.pattern.proxy.cglib;

/**
 * @ClassName HouseOwner
 * @Author xinfei
 * @Date 2019/1/15 16:14
 **/
public class HouseOwner {

    //目标类
    public void buyHouse() {
        System.out.println("我是房主： 我有买房房源");
    }

    public void rentHouse() {
        System.out.println("我是房主： 我有租房房源");
    }
}
