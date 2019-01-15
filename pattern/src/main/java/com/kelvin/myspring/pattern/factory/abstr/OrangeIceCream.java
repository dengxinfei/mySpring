package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName IOrangeIceCream
 * @Author xinfei
 * @Date 2019/1/4 18:14
 **/
public class OrangeIceCream implements IceCream{

    @Override
    public void eat() {
        System.out.println("我是橙子口味的冰激凌");
    }
}
