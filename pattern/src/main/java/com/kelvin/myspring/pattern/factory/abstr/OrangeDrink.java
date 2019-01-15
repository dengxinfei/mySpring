package com.kelvin.myspring.pattern.factory.abstr;

/**
 * @ClassName OrangeDrink
 * @Author xinfei
 * @Date 2019/1/4 18:42
 **/
public class OrangeDrink implements IDrink {

    @Override
    public void drink() {
        System.out.println("我是橙子味的饮料");
    }
}
