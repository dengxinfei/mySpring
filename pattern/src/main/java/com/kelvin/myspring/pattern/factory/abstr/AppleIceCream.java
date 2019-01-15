package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName IOrangeIceCream
 * @Author xinfei
 * @Date 2019/1/4 18:14
 **/
public class AppleIceCream implements IceCream{

    @Override
    public void eat() {
        System.out.println("我是苹果口味的冰激凌");
    }
}
